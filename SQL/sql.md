## Full-Stack
- React for front-end
- Java for back-end server that accepts requests and sends responses
- Once we stop Java program, all of the data/variables we created are going to be wiped
    - We saw this with the GraphQL server where the data wouldn't persist between restarting our server
- So we need a solution that lets us store our data permanently and doesn't get wiped when we stop our server

## SQL and Databases
- Databases are a way to store data and persist it permanenty
- SQL - Structured Query Language
- Structrured - we define rigorous rules for what our data looks like
    - Store our data in tables
    - Each table has rows and columns
    - Columns have specific rules about what data can go inside (data types (numbers vs strings, etc.), constraints (non-null))
    - Goes well with Java because we use classes to structure our objects
        - See some similarities between Java Classes and SQL tables
    - ![Ex of structured table](https://s33046.pcdn.co/wp-content/uploads/2020/07/anatomy-of-a-sql-table-F-624x214.png)
- Query - 
    - Lets us write detailed queries so we get exactly the data that we want
        - ex: we want all pets older than 6 who are dogs
        - ex: all dogs with brown fur that aren't adopted
        - ex: person with id 1

## Dialects
- postgreSQL and mySQL are examples of dialects
- Each dialect has different syntax but should have the same functionality
- DO NOT mix up dialects with sub-languages

## Relational Database
- Database - collection of data and we use one or more databases for a single project
    - We'll create a database using postgreSQL
- Tables - usually represent some entity (pet, person, book, student)
    - Tables have columns which represent the fields (id, name, species, title, etc.)
    - Tables have records/rows that indicate a particular entry
    - Tables can also represent connections/relations between entities
- Relational
    - Tables are related to each other
    - Pets and people could be related in the sense that a person could adopt a pet
    ![Example of Relational Database](https://www.researchgate.net/profile/Vimal-Kumar-Dhanasekar/publication/264823200/figure/fig1/AS:823629063393280@1573379879885/Multi-relational-database-an-example.png)

## Keys
- Primary Key
    - all values in the table are unique
    - no null values
    - Good for identifying a particular record
    - ```create table pets (id serial primary key);
    - Distinction is that primary key is not the same as serial
        - serial allows for the auto-increment ability of the column
        - primary key ensures uniqueness and non-null
- Foreign Key
    - this lets a column of one table refer to another
    - we need at least 2 tables
    - Usually a field of one table will reference the primary key of another

## Types of Multiplicity Relationships:
- One-to-One
    - One person has one SSN (Social Security Number)
    - One SSN belongs to one person
    - Could have a field SSN
    - Could also have 2 tables that reference each other
        - Person references SSN table
        - SSN table references person
- One-to-Many
    - One person can own many pets
    - One pet cannot belong to many owners
    - In SQL, represented by a column of one entity referencing the primary key of another
        - ex: owner_id from pet table references the primary key of the person table
- Many-to-Many
    - One person takes many classes
    - One class can have many people taking it
    - In SQL, we need 3 tables
        - Person table (entity)
        - Class table (entity)
        - Person_Takes_Class
            - person_id references person
            - class_id references class
        - An entry in this table indicates that that person takes that class



## Sub-Languages
- a way to sort SQL commands based on what they're doing (creating tables, mutating data, querying data, etc.)
- DDL - Data Definition Language
    - Creating tables, altering tables, setting up the structure of our data
    - Commands:
        - CREATE - create a table/database
            - when we create a table, we have to specify the columns, fields, etc.
        - ALTER - changing a table
            - rename, add columns, update columns, add constraints, delete columns
        - DROP - drop a table/database
            - drop/remove the table/database from existence
        - TRUNCATE - removes data from table
            - wipes the data from a table but keeps the table
    - ```CREATE TABLE pets (name VARCHAR(50), age INTEGER);```
    - Constraints
        - Primary Key - non-null, unique
        - Foreign Key - reference another table and ensure that the referenced value is valid, not null
        - Unique - we can make a column unique without the non-null
        - Not Null - we can require a column to have non-null values
        - Check - checks a given value before it is inserted
    - Default - set a default value for a given column
        - if we don't provide a value, then the default value will be used
- DML - Data Manipulation Language - updating the records of the table
    - INSERT - inserts a new record to the table
    - UPDATE - updates a pre-existing record(s)
    - DELETE - deletes a record(s) from the table
- DQL - Data Query Langauge
    - Commands:
        - SELECT - selectes/reads data from a given table
- TCL - Transaction Control Language
    - Transaction - a series of commands (usually DML)
        - Inserts, updates, deletes
    - TCL gives us control over how multi-line transactions affect the database
    - Commands:
        - Begin - begins/starts a transaction
        - Commit - once we've executed our commands, commit actually persists those changes to the database
        - Rollback - go back to the beginning of the transaction, undo all the changes we made during that transaction
    - [More on Transactions](https://4js.com/online_documentation/fjs-fgl-3.00.05-manual-html/c_fgl_transactions_002.html#:~:text=A%20database%20transaction%20delimits%20a,canceled%20as%20a%20unique%20operation.&text=The%20database%20server%20is%20in%20charge%20of%20data%20concurrency%20and%20data%20consistency%20.)
- DCL - Data Control Language
    - Controls who is allowed to do what on our data
    - Commands
        - Grant - give permissions to a user to operate on a particular table
        - Revoke - revokes/removes those permissions

## Transaction Requirements
- ACID Acronym
- Atomicity - we can't break a transaction down, all or nothing
    - either all commands go through or none of them do
    - ex: transferring money, we wouldn't want one person to lose/gain money without the change being reflected in the other account
- Consistency - when we write a transaction, we want the database to be affected in a consistent/expected way
    - ex: If I transfer money to someone, I want to have x less dollars and my friend to have x more dollars
- Isolation - each transaction should happen independently of one another
    - we wouldn't want 2 transactions to interfere (Ex: if I was depositing money to my friend's account at the same time as my paycheck being deposited to my account, I wouldn't want those to affect each other)
- Durability - if something catastrophic happens, database down, connection fails, make sure transaction is persisted and ensure that the database remains in tact
    - ex: if the database server went down, I wouldn't want to lose money, bank wouldn't want me to gain money


## Data Types
- INTEGER - like an int in Java, store whole numbers
- FLOAT - like a float/double in Java, store decimals
- SERIAL - like an integer but lets us use the default keyword to auto-increment the value
    - we should use this for id fields
    - when we insert into the table, we should pass in default as the id to let the database generate the new id
- VARCHAR - like a string in Java
    - we declare it with the number of characters in a single value, I use 50 as default
- date - store a date with month day and year
    -  '1970-01-01'
- timestamp - includes a date as well as a time
    - '2016-06-22 19:10:25-07'
- boolean - true/false
- List of data types: https://www.geeksforgeeks.org/postgresql-data-types/ 

## Getting Started
- We need a way to run our database to be able to connect to it
    - We need a server to be running to be able to listen to requests and update the data
- One solution is to run a server on our own machine and send requests that way
- Another solution is to host a database online and connect it to it from our machine
    - This gives us practice with AWS
    - We don't have to use our own resources to spin up the server

## Dbeaver
-  SQLEditor - lets us create new scripts
- Keep in mind, make sure to be on the right connection

## CRUD
- Create - DML
- Read
- Update - DML
- Delete - DML

## DELETE vs DROP vs TRUNCATE
- Drop - drops the whole table/database
- Truncate - deletes the data from the table
- Delete - deletes the data from the table with more control if you include a where clause
    - truncate is the same as delete with no where clause

## Joins
- A way to combine the results from different tables in one query
    - useful if we have multiplicty relationships between tables

### Different Types of Joins
1. Inner Join - we take records from tables that have matches in both tables
- ```select person.name, pet.name from person join pet on pet.owner_id = person.id```
- Only display records with matches in both tables
- For example, if there was a person with no pets, we wouldn't see that person
- If there was a pet with no owner, we wouldn't see that pet
2. Left Outer Join - we take all records from the left side, but not necessarily everything from the right side
    - we could have null values in the right table
3. Right Outer Join - we take all records from the right side, but not necessarily everything from the left side
    - could have null values in the left table
4. Full Outer Join
    - we take everything from both tables, could have null values on either side
5. Cross Join
    - cartesian product
    - return every combination of table 1 and table 2
    - ```select * from person cross join pet order by person.name;```
- 6. Self Join
    - Joining a table with itself
    - ```select pet1.name as pet1_name, pet2.name as pet2_name from pet pet1 inner join pet pet2 on pet1.species = pet2.species and pet1.id != pet2.id;```
![Different Types of Joins](https://dq-blog-files.s3.amazonaws.com/joins-tutorial/join_venn_diagram.svg)


### Set Operations
- Set operations operate on the results of 2 queries
1. Union - taking everything from both queries
2. Intersect - taking records that match both queries
3. Union All - taking everything from both queries and include duplicates
4. Except - takes everything from the first query except those that appear in the second query

### Sub Queries
- We can use queries within queries:
- ```select * from person where salary > (select avg(salary) from person);```

### Views
- store the results of a query


