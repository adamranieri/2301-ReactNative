## Normalization
- The process of minimizing redundancy, organizing, and maintaining the integrity of a database
- There are different "Normal Forms" which indicate how normalized the database is
- Each form builds on the last
    - DBs in 3NF are also in 1NF, 2NF, etc.

### Functional Dependency
- A functional dependency (FD) is a relationship between two attributes, typically between the PK and other non-key attributes within a table. For any relation R, attribute Y is functionally dependent on attribute X (usually the PK), if for every valid instance of X, that value of X uniquely determines the value of Y
    - X -> Y
- For example, a student id determines student name, age, birthday
- But, a student id wouldn't determine class id (because student could be taking different classes)

### First Normal Form
- A single cell in the database must only hold one value
- All databases we have created are in 1NF because SQL does not allow you to have many values in a single cell

- This table is in 1NF because there are not multi-valued cells:
- It does include some obvious reduncancies which will be fixed in future forms
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
- No Partial Dependency
    - In other words, all non-key attributes are fully dependent on a primary key
- In the above table, we see things like class ID and Class Name which violate 2NF
    - This is because, for any student id, we could get multiple classes
- To fix this, we can make 2 tables
    - One that maps student id to class id
    - One that maps class id to class name

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
| Student ID | Student Name | Age | Birthday  | House Code | House      |
|------------|--------------|-----|-----------|------------|------------|
| 1          | Harry        | 15  | 07/31/1980               | G          | Gryffindor |
| 2          | Ron          | 15  | 03/01/1980             | G          | Gryffindor |
| 3          | Ginny        | 14  | 08/11/1981  | G          | Gryffindor |
| 4          | Draco        | 15  | 06/05/1980           | S          | Slytherin  |

### Third Normal Form
- Our database is looking better, but there is still some optimizing we can do
- 3NF requires 2NF to be true as well as the elimintation of transitive partial dependencies
- A transitive partial dependency is defined as: 
    - a non-prime attribute (an attribute that is not part of the table's primary key) is dependent on another non-prime attribute
- Here, we have a transitive dependency because the House field "depends on" the House Code field.
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
- A relation is in BCNF if, X is superkey for every functional dependency X->Y in given relation. 
- This database is already in BCNF because for each table:
    - Every functional dependency has a left side which is a superkey of the table/relation
    - Specifically, this is true because each table has only one functional dependency (primary key uniquely identifies the other columns of the relation)

