-- start by dropping the tables:
drop table if exists pet, person;

create table if not exists person(id serial primary key, name varchar(50));

-- owner_id references the person table (by default, referencing the primary key):
-- this means is if we try to add a pet and give it an owner id, it will first check to make sure that owner exists in the owner table
-- referential integrity, making sure that the records we're referencing actually exist, non-null, etc.
create table if not exists pet(id serial primary key, name varchar(50), species varchar(50), food varchar(50), owner_id integer references person);

-- we can auto generate id if we don't specify column:
insert into person (name) values ('Rory');

select * from person;

-- because we have the foreign key relationship set up, we are not allowed to insert 
-- a record that has an owner_id that does not correspond to an existing person in the person table:
insert into pet (name, species, food, owner_id) values ('Ashes', 'cat', 'tuna', 2);

select * from pet;


