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
