package org.example.data;

import org.example.entity.Pet;
import org.example.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetDaoImpl implements PetDao{

    // this object represents our connection to the database
    Connection connection;

    public PetDaoImpl() {
        // set up our connection
        // Because we use the same connection throughout our entire program, we could use Factory/Singleton here
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public Pet insert(Pet pet) {
        System.out.println(pet);
        // create SQL statement and then send it to the database
        // question marks are where we inject Java values
        String sql = "insert into pet values (default, ?, ?, ?);";
//        sql = "insert into pet values (default, '" + pet.getName() + "', '" + pet.getSpecies() + "', '" + pet.getFood() + "');";

        try {
            // when we prepare the statement we pass in a flag which is saying "I want the generated id value, so make sure you return it
            // in the response
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // fill in the values from our pet object:
            preparedStatement.setString(1, pet.getName());
            preparedStatement.setString(2, pet.getSpecies());
            preparedStatement.setString(3, pet.getFood());
            System.out.println(preparedStatement);

            // this method actually executes the statement (we'll use the same method for update and delete)
            int count = preparedStatement.executeUpdate();

            // make sure we are updating exactly 1 row:
            if(count != 1) {
                return null;
            }

            // this method returns the generated id assuming we passed in the flag earlier:
            // returns a result set which contain a pointer to the data that we want:
            ResultSet result = preparedStatement.getGeneratedKeys();
            // increment the result set pointer
            result.next();
            // there's only one value, we pass in 1
            int generatedId = result.getInt(1);
            // set the id to the pet's id field:
            pet.setId(generatedId);


        } catch (SQLException e) {
            System.out.println("Something went wrong when trying to send the insert statement to the database");
            e.printStackTrace();
        }

//        Statement statement = new Statement(sql);


        // insert to database

        return pet;
    }

    @Override
    public Pet getById(int id) {
        String sql = "select * from pet where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // injecting the id that we pass into the ? slot in our SQL command:
            preparedStatement.setInt(1, id);

            // result set:
            ResultSet resultSet = preparedStatement.executeQuery();

            // use an if statement to detect if there even is a pet
            // if true, it also should increment the pointer to what we want (should be the pet object)
            if(resultSet.next()) {
                // if we are in this code block, it means we have a pet:
                // use the .getInt, .getString and pass in the columns to get the values:
                int idDb = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String species = resultSet.getString("species");
                String food = resultSet.getString("food");

                // using the fields from the query, we can create a pet object
                Pet pet = new Pet(idDb, name, species, food);

                if(id != idDb) {
                    System.out.println("Ids do not match");
                    return null;
                }
                return pet;
            }


        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Pet> getAll() {
        String sql = "select * from pet;";

        // create an empty list to store all the pets that we want to return:
        List<Pet> pets = new ArrayList<>();

        try {
            // Don't need a prepared statement, because there are no values to inject:
            Statement statement = connection.createStatement();

            // pass in the sql string here:
            ResultSet resultSet = statement.executeQuery(sql);

            // Instead of an if, we have a while loop because there could be many pets:
            // This loop will keep iterating until we run out of pets:
            while(resultSet.next()) {
                int idDb = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String species = resultSet.getString("species");
                String food = resultSet.getString("food");

                // using the fields from the query, we can create a pet object
                Pet pet = new Pet(idDb, name, species, food);

                pets.add(pet);

                // move on to the next pet (this will happen because we are in a loop)
            }

        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Something went wrong when querying for all pets");
        }
        // return the list of pets
        // it could be empty
        return pets;
    }

    @Override
    public Pet update(Pet pet) {
        String sql = "update pet set name = ?, species = ?, food = ? where id = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pet.getName());
            preparedStatement.setString(2, pet.getSpecies());
            preparedStatement.setString(3, pet.getFood());
            preparedStatement.setInt(4, pet.getId());
            System.out.println(preparedStatement);

            // count should store how many rows are affected
            int count = preparedStatement.executeUpdate();

            // if count is 1, that means row should be updated:
            if(count == 1) {
                return pet;
            }
            else if (count == 0) {
                // nothing was updated
                return null;
            }
            else {
                System.out.println("More than 1 row was updated... how is this possible?");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from pet where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int count = preparedStatement.executeUpdate();
            // deletion successful:
            if(count == 1) {
                return true;
            }
            // this id didn't exist:
            else {
                return false;
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
