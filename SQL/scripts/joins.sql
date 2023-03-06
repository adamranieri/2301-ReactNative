drop table if exists pet, person;

-- DDL commands to create tables:
create table person (id serial primary key, name varchar(50));
create table pet (id serial primary key, name varchar(50), species varchar(50), food varchar(50), owner_id integer); -- normally, we would want a foreign key relationship between pet and person

insert into person values(default, 'Shaggy');
insert into person values(default, 'John');
insert into person values(default, 'Rory');
-- Steve does not have any pets:
insert into person values(default, 'Steve');

insert into pet values(default, 'Scooby', 'Dog', 'scooby snacks', 1);
insert into pet values(default, 'Garfield', 'Cat', 'lasagna', 2);
insert into pet values(default, 'Ashes', 'Cat', 'tuna', 3);
-- this cat does not have an owner
-- If we had a foreign key set up for owner_id, this would not be possible because it would need a valid owner id for that column:
insert into pet values(default, 'Independent Cat', 'Cat', 'cat food', null);

select * from pet;
select * from person;


-- the owner_id column of the pet table shold match up with the id column of the person table:
-- because this is an inner join, we don't see any null values, Steve, or Independent Cat because inner 
-- join only takes matches with records in both tables
select person.name as person_name, pet.name as pet_name from person join pet on pet.owner_id = person.id;

-- left join, takes everything from the left table
select person.name as person_name, pet.name as pet_name from person left outer join pet on pet.owner_id = person.id;

-- right join, takes everythin from the right table
select person.name as person_name, pet.name as pet_name from person right outer join pet on pet.owner_id = person.id;

-- because this is a full outer join, we DO see null values
select person.name as person_name, pet.name as pet_name from person full outer join pet on pet.owner_id = person.id;

-- Cross Join - every combination of left table with right table
-- don't see a join condition because we want every single combination of pet to person
select * from person cross join pet order by person.name;


-- Self Join
-- join a table with itself
-- getting all pairs of pets where the species match
-- pet1 and pet2 are aliases of the same table so we can use them as if they're 2 separate tables
select pet1.name as pet1_name, pet2.name as pet2_name from pet pet1 inner join pet pet2 on pet1.species = pet2.species and pet1.id != pet2.id;

