-- Before we execute any script, we want to make sure we have our connection selected at the top

-- If the table pets exists, drop it to get a fresh start:
drop table if exists pets;

-- create table if it does not already exist
create table if not exists pets (id serial primary key, name varchar(50), species varchar(50), foood varchar(50));

-- alter table and rename the column to fix my typo:
alter table pets rename foood to food;

-- truncate removes all data from a table without getting rid of the table itself
-- same as delete statement without a where clause:
truncate pets;

-- If we try to insert the same id twice, we should get stopped by the primary key constraint
insert into pets values(1, 'Ashes', 'cat', 'tuna');
-- also can't insert null value in primary key column:
insert into pets values(null, 'Ashes', 'cat', 'tuna');




