drop table pet;

create table pet (id serial primary key, name varchar(50), species varchar(50), food varchar(50));

insert into pet values (default, 'ashes', 'cat', 'tuna');

-- there's no value in this query that we have to pass in
select * from pet;

-- select pet by id:
select * from pet where id = 100;

-- to update pet, we basically need the full pet object:
update pet set name = 'Ashes updated', species = 'cat updated', food = 'tuna updated' where id = 12;

-- delete statements should usually delete by id
delete from pet where id = 9;





