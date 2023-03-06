package org.example.data;

import org.example.entity.Pet;
import org.example.util.ConnectionFactory;

import java.sql.*;

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
            preparedStatement.executeUpdate();

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
}
