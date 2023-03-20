## Normalization
- The process of minimizing redundancy, organizing, and maintaining the integrity of a database
    - But can also make querying more difficult
        - Normalized when write-heavy
        - Denormalized when read-heavy
- There are different "Normal Forms" which indicate how normalized the database is
- Each form builds on the last
    - DBs in 3NF are also in 1NF, 2NF, etc.
- The further up we go, the more "normalized" the database is
### Functional Dependency
- A functional dependency (FD) is a relationship between two attributes, typically between the PK and other non-key attributes within a table. For any relation R, attribute Y is functionally dependent on attribute X (usually the PK), if for every valid instance of X, that value of X uniquely determines the value of Y
    - X -> Y
- For example, a student id determines student name, age, birthday
    - If we have student id 1, we know what their name is, what their age is, and what their birthday is
    - It couldn't be the case that an id of 1 could give us 2 or more different names
    - On the other hand, if we have a student name, (a common name like Will Smith), it could map to different ids, birthdays, etc.
- But, a student id wouldn't determine class id (because student could be taking multiple classes)
    - One student could be taking multiple classes

### First Normal Form
- A single cell in the database must only hold one value
    - atomic - can't break it down into any more meaningful data
    - ex: storing an array is non-atomic because it could be broken down into its individual elements
    - We could argue storing date isn't atomic because it could be broken into month, day, year
- All databases we have created are in 1NF because SQL does not allow you to have many values in a single cell

- This table is in 1NF because there are not multi-valued cells:
- It does include some obvious reduncancies which will be fixed in future forms
- In this table, we could use a composite key (student id and class id)
#### Students
| Student ID | Student Name | Age | Birthday   | Class ID | Class Name                    | House Code | House      |
|------------|--------------|-----|------------|----------|-------------------------------|------------|------------|
| 1          | Harry        | 15  | 07/31/1980 | 100      | Potions                       | G          | Gryffindor |
| 1          | Harry        | 15  | 07/31/1980 | 101      | Herbology                     | G          | Gryffindor |
| 2          | Ron          | 15  | 03/01/1980 | 100      | Potions                       | G          | Gryffindor |
| 3          | Ginny        | 14  | 08/11/1981 | 102      | Charms                        | G          | Gryffindor |
| 3          | Ginny        | 14  | 08/11/1981 | 103      | Defense Against the Dark Arts | G          | Gryffindor |
| 4          | Draco        | 15  | 06/05/1980 | 100      | Potions                       | S          | Slytherin  |

### Second Normal Form
- Must be 1NF
- No Partial Dependencies
    - In other words, all non-key attributes are fully dependent on a primary key
    - No data that can be calculated/determined using the primary key
- In the above table, we see things like class ID and Class Name which violate 2NF
    - This is because class cannot be solely determined/calculated by the student's id
- To fix this, we can make 2 tables
    - One that maps student id to class id
    - One that maps class id to class name
- Furthermore, we could eliminate the age column because we have birthday. Age can always be calculated by using the current date

#### Student to Course ID:
| Student Id | Class ID |
|------------|----------|
| 1          | 100      |
| 1          | 101      |
| 2          | 100      |
| 3          | 102      |
| 3          | 103      |
| 4          | 100      |

#### Course ID to name
| Class ID | Class Name                    |
|----------|-------------------------------|
| 100      | Potions                       |
| 101      | Herbology                     |
| 102      | Charms                        |
| 103      | Defense Against the Dark Arts |

#### Updated Students Table:
| Student ID | Student Name |  Birthday  | House Code | House      |
|------------|--------------|-----------|------------|------------|
| 1          | Harry          | 07/31/1980               | G          | Gryffindor |
| 2          | Ron            | 03/01/1980             | G          | Gryffindor |
| 3          | Ginny          | 08/11/1981  | G          | Gryffindor |
| 4          | Draco          | 06/05/1980           | S          | Slytherin  |

### Third Normal Form
- Our database is looking better, but there is still some optimizing we can do
- 3NF requires 2NF to be true as well as the elimintation of transitive partial dependencies
- A transitive partial dependency is defined as: 
    - an attribute isn't directly dependent on the primary key
    - It is dependent on another field, which is dependent on the primary key
- Here, we have a transitive dependency because the House field is dependent on the House Code field which is then dependent on the student id
- We can fix this by making a new table that maps House Code to House, and getting rid of the House field on the students table

#### House Code to House
| House Code | House      |
|------------|------------|
| G          | Gryffindor |
| H          | Hufflepuff |
| R          | Ravenclaw  |
| S          | Slytherin  |

#### Updated Students Table:
| Student ID | Student Name | Age | Birthday  | House Code |
|------------|--------------|-----|-----------|------------|
| 1          | Harry        | 15  | 07/31/1980               | G          |
| 2          | Ron          | 15  | 03/01/1980             | G          |
| 3          | Ginny        | 14  | 08/11/1981  | G          |
| 4          | Draco        | 15  | 06/05/1980           | S          |

#### Student to Course ID:
| Student Id | Class ID |
|------------|----------|
| 1          | 100      |
| 1          | 101      |
| 2          | 100      |
| 3          | 102      |
| 3          | 103      |
| 4          | 100      |

#### Course ID to name
| Class ID | Class Name                    |
|----------|-------------------------------|
| 100      | Potions                       |
| 101      | Herbology                     |
| 102      | Charms                        |
| 103      | Defense Against the Dark Arts |


Now we see the tables should store the same information, but there is much less redundancy and the tables are better organized!


### Boyce-Codd Normal Form
- A superkey is a set of properties that include the key
    - If key was studentId
    - Superkeys: {studentId}, {studentId, studentName}
- Must be in 3NF
- A relation is in BCNF if, X is superkey for every functional dependency X->Y in given relation. 
- This database is already in BCNF because for each table:
    - Every functional dependency has a left side which is a superkey of the table/relation
    - Specifically, this is true because each table has only one functional dependency (primary key uniquely identifies the other columns of the relation)

### Final Notes
- Again, keep in mind that normalization isn't always the best option. In our fully normalized database, the queries will be more complicated to write and take more time query for information. The benefit is that there is less storage being taken up. So keep in mind the following when deciding to normalize a database:
    - Is the database read-heavy or write-heavy?
    - Is time or storage efficiency being prioritzed?