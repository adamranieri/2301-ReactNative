-- make sure name is unique and power is not null
drop table superhero;
create table superhero (id serial primary key, name varchar(50) unique, power varchar(50) not null check (length(power) > 0), strength integer default 5);

-- can't rerun this command because that would violate the unique name constraint
insert into superhero values (default, 'Spider-Man', 'Webs');

-- can't insert null into the power column
insert into superhero values (default, 'Bat-Man', null);


insert into superhero values (default, 'Bat-Man', 'No powers');

-- this violates our check constraint which requires the power value to be longer than 0
--insert into superhero values (default, 'Super-Man', '');
insert into superhero values (default, 'Super-Man', 'Flying', 10);

-- use default value of 5 for strength
insert into superhero values (default, 'Iron-Man', 'Suit', default);

select * from superhero;