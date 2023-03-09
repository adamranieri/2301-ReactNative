## Spring Data
- Helps us configure and interact with database
- JDBC - Java Database Connectivity
- ORM - Object Relational Mapping
    - Mapping Java objects to a relation/table in our database
    - We did this manually by creating a Pet table and a Pet class
        - Made sure that the fields of the Pet class matched the columns of the Pet table
    - When using Spring Data, we have to provide some configuration in the form of annotations in order to map them


### ORM
- Be careful about using some keywords, just make sure your classes and fields don't conflict with default PSQL keywords
    - Examples
        - user
        - desc

### Properties
- https://springhow.com/spring-boot-database-initialization/
```
# we can manually specify port, otherwise it will default to 8080:
server.port = 8080

# Setting the dialect to be PostgresSQL:
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
# Our DDL commands will be automatically updated when we change our classes:
spring.jpa.hibernate.ddl-auto=create-drop
# show SQL commands in the console when we call the Repository methods
spring.jpa.hibernate.show-sql=true

# url for the database connection:
spring.datasource.url=jdbc:postgresql://spring-data-db.cmm7dyyeb3rr.us-east-1.rds.amazonaws.com/pets
# username and password for the connection:
spring.datasource.username=postgres
spring.datasource.password=password
```


### Annotations
- @Entity - marks a class as being mapped to a table
- @Table - lets you configure properties about the table itself including name
- @Id - marks this field as the primary key of the table
- @Generated - indicates that this field should be auto-incremented, can specify the generation type
- @Column -  lets you configure properties about the column itself including name, unique, non-null, etc.

### Spring Annotations vs Manually Configuring in SQL:
- For basic entities, it's probably good to stick with Spring
- More complex situations like multiplicity relationships, could be beneficial to configure direclty in SQL