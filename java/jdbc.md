## Why?
- Right now, before knowing JDBC, we have to write all of our scripts manually in DBeaver
    - We can imagine this won't work well on an enterprise level
    - Imagine logging ino instagram and we have to manually type in:
        - select * from posts where userId = rory123;
    - JDBC - Java Database Connectivity
        - Allows us to connect our database to Java, which lets us programatically execute SQL commands which is an integral step in getting a full-stack application
    - Database -> Java -> REST server -> React -> Web Page

## Design Patterns
- A standard that we follow in our code to achieve good coding practice (readability, efficiency, memory storage efficiency)

### Factory Design Pattern
- Responsible for instantiating/creating and returning instances of a class
- Programatic way to insantiate classes and determine which will be used
- Can help with memory management (Especially when used with Singleton), code clarity

### Singleton Design Pattern
- Only one instance of the value/object in our entire program that we re-use
    - Saving memory, we don't want to allocate more memory than necessary if we don't need to
- We could set up a factory that only returns that single instance

### DAO Design Pattern
- Data-Access-Object
- We set up an interface and class implementation whose sole responsibility is interacting with database
    - CRUD methods (Create, Read, Update, Delete)
    - We don't worry about logic, reading from command line, HTTP REST stuff

### We want to hide the url, password, username, etc.
- In IntelliJ, we create a resources folder
    - Right-Click main, select new -> directory
    - Click on "resources"
    - In this folder, we'll create a file called DbConfig.properties
```
url=jdbc:postgresql://db-3-6.cmm7dyyeb3rr.us-east-1.rds.amazonaws.com/postgres
username=postgres
password=password
```

## Set up our Driver
- can go to mvnrepository.com
- Search for postgresql
- https://mvnrepository.com/artifact/org.postgresql/postgresql
- Click on the latest version and add the dependency to the pom xml

## SQL Injection
- If we use string concatenation to create our SQL queries, then SQL Injection can occur
- For example, if the user types in a command like delete from pet;, then that command could make its way into the database
- Prepared statement

## ResultSet
- whenever we get return value from the database, we get a result set
- like a pointer, initially pointing to an empty set
- then we have to use resultSet.next() to increment
- finally, we use the index to choose which value of the set we are dealing with:
```
-> empty
     1    2        3
-> {id, name, species}
-> {id, name, species}
```

## JDBC API
- [Here](https://www.javatpoint.com/java-jdbc) is a good overview of the JDBC API
- We learned about these interfaces/classes:
    - Driver Manager
    - Simple Statement
    - Prepared Statement
    - Connection
    - ResultSet
- Common methods
    - executeUpdate - used for inserts, updates and deletes (DML), return count for how many records updated
    - getGeneratedKeys - after an insert, we use this method to get the generated id value, returns a result set ( used mostly for inserts)
    - executeQuery - used for select, return the results of the query in a result set (DQL)

    ![Result Set](https://cf.ppt-online.org/files/slide/n/nf5tsEiGLUZQ4Medu8lcXAgxpDT2F60SzK7Hr9/slide-5.jpg)



## High Level Overview of Steps
1. Create Database and table. 
    - Pet(id, name, species, food)
2. Create Java Maven project
3. Create Connection Factory
    - ConnectionFactory.java
    - Using the Factory and Singleton design pattern, ensure only one connection to the database exists
    - Store our username, password, url in .properties file and use Resource Bundle to read them in
4. Create Entity Class
    - Pet.java
    - Encapsulates our pet objects with fields (id,name, species, food, etc.)
    - Make sure this matches table in database
5. Create Dao interface
    - should contain method signatures of CRUD methods (insert, update, delete, read)
6. Create Dao implementation
    - Constructor should use connection factory to create connection
    - Each method should 
        - Set up SQL string using PreparedStatement or Statement
        - Inject values when applicable
        - Execute the Statement
        - Return the appropriate values (Pet, List of Pets, etc.)
7. In App.java, instantiate the Dao object and call the insert method on a dummy Pet object
    - Tomorrow, we will add a Service layer and a Command Line layer to make the project more scalable