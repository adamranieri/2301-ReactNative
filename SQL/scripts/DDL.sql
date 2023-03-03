-- Before we execute any script, we want to make sure we have our connection selected at the top

-- If the table pets exists, drop it to get a fresh start:
drop table if exists pets;

-- create table if it does not already exist
create table if not exists pets (id integer, name varchar(50), species varchar(50), foood varchar(50));

-- alter table and rename the column to fix my typo:
alter table pets rename foood to food;