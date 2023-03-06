drop table pet;

create table pet (id serial primary key, name varchar(50), species varchar(50), food varchar(50));

insert into pet values (default, 'ashes', 'cat', 'tuna');

select * from pet;