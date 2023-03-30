-- when we start the program, create a table pet
-- We could use the ORM to map our entities and create the table automatically but the "Vanilla" SQL code is good if
-- we want to manually create foreign keys, other types of constraints
create table pet(id serial primary key, name varchar(50), species varchar(50));
