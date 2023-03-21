package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.ResourceBundle;

// This is a factory class, it is responsible for creating and returning objects:
// Specifically, this class will set up our connection to the database and ensure that it is
// adhering to the Singleton design pattern
public class ConnectionFactory {
    // In Java, how could we make something a Singleton?
    // we can use static keyword to make sure it is scoped to the class level, not the instance level:
    // Just making it static doesn't totally cover the Singleton pattern
    // Making this method private gives us a lot of control over its instantiation
    private static Connection connection = null;

    // make a private constructor, so Java doesn't make a default constructor for us
    // And it prevents other classes instantiating a ConnectionFactory
    private ConnectionFactory() {
    }

    // make a method where we have ultimate control over how we instantiate the Connection object
    public static Connection getConnection()  {
        if(connection == null) {
            // This means we haven't created the connection yet so we can do that here
            // What values do we need to connect to the database?
            // declare that we're using the postgres jdbc driver and database that we're connecting to:

            // use a Resource BUndle to get our connection information:
            ResourceBundle bundle = ResourceBundle.getBundle("DbConfig");

            String url = bundle.getString("url");
            String username = bundle.getString("username");
            String password = bundle.getString("password");


            try {
                // DriverManager.getConnection takes in our credentials and returns a connection to the database
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Something went wrong when connecting to the database");
                connection = null;
            }
        }

        // Either way, we return the connection, whether it was just created or before
        return connection;

    }



}
