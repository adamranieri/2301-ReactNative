package org.example.data;

import org.example.entity.Pet;
import org.example.util.ConnectionFactory;

import java.sql.Connection;

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
        // create SQL statement and then send it to the database

        // insert to database

        return null;
    }
}
