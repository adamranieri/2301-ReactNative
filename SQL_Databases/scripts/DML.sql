-- Data Manipulation Language
-- insert, update, delete

-- this works because we match the order of how we declared our fields
-- default will make the id auto-incrememnt because we set up the id field as serial type:
insert into pets values(default, 'Ashes', 'cat', 'tuna');

-- will have null for id:
insert into pets (name, species, food) values ('Shadow', 'cat', 'water');

-- update: (This is a dangerous statement because it will affect all rows in the table)
-- We also want to include a where clause on updates/deletes
update pets set species = 'Cat';

update pets set species = 'Cat' where id = 2;

-- one of the single most danerous statement in SQL:
delete from pets;

delete from pets where id = 4;

-- with select, we can view certain fields
select name, species, food from pets;

-- or we can use * to view all:
select * from pets;




