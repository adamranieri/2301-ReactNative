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