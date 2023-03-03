
-- make a person table to store people's jobs, occupation, salary
create table person (id serial, name varchar(50), occupation varchar(50), salary integer);

insert into person values (default, 'rory', 'astronaut', 500);
insert into person values (default, 'harry', 'wizard', 200);
insert into person values (default, 'ron', 'wizard', 100);
insert into person values (default, 'luke', 'jedi', 0);
insert into person values (default, 'gandalf', 'wizard', 1000);
insert into person values (default, 'shrek', 'vigilante', 300);
insert into person values (default, 'harry', 'musician', 2000);
insert into person values (default, 'anna', 'musician', 2000);
insert into person values (default, 'mike', 'musician', 2000);
insert into person values (default, 'ben', 'musician', 2000);
insert into person values (default, 'dan', 'musician', 2000);
insert into person values (default, 'han', 'musician', 2000);
insert into person values (default, 'han', 'musician', 2111);
insert into person values (default, 'gandalf', 'wizard', 1000);
insert into person values (default, 'gandalf', 'wizard', 1000);
insert into person values (default, 'gandalf', 'wizard', 1000);


-- select every field/column with no where clause (every record)
select * from person;
-- only certain fields:
select name, occupation, salary from person;

-- specify which rows:
select * from person where occupation = 'wizard';
select * from person where occupation = 'wizard' and salary < 1000;

-- if we have an id, we can include in the clause to get a specific row:
select * from person where id = 4;

-- likw keyword lets us do some more fancy comparisons:
-- These 2 commands are the exact same:
select * from person where name like 'ron';
select * from person where name = 'ron';

-- the percent is like a catch-all pattern so here we're saying
-- we want all names that start with r and we don't care what the rest of the name is
select * from person where name like 'r%';
select * from person where name like '%n';
-- all names with an a in the word
select * from person where name like '%a%';

-- we can do math operations to get all salaries that are in the 2,000's:
select * from person where salary/1000 = 2;

-- Dates:
-- add a birthday column to our table:
alter table person add column bday date;

update person set bday = '1970-01-01';
update person set bday = '1980-07-31' where name = 'harry';
update person set bday = '1980-04-01' where name = 'ron';
update person set bday = '02-09-2010' where name = 'shrek';

select * from person;

-- get everybody born before Jan 1st, 1980:
select * from person where bday < '1980-01-01';
-- get everybody born after that date:
select * from person where bday > '1980-01-01';

-- time stamps:
create table work_times (start_time timestamp, end_time timestamp);
insert into work_times values ('2016-06-22 08:10:25-07', '2016-06-22 16:10:25-07');

-- all work_times where start_time is after the following time stamp:
select * from work_times where start_time > '2016-06-22 07:10:25-07';

-- all work times before
select * from work_times where start_time < '2016-06-22 07:10:25-07';


-- order by (default to ascending order)
select * from person order by salary, name;

-- specify descending order:
-- Be careful when making description fields, don't shorten it to "desc":
select * from person order by salary desc;

-- limit to top 5 salaries:
select * from person order by salary desc limit 5;


-- GROUP BY groups results be a particular field/column
-- HAVING - like the WHERE clause but acts on a certain group:
select occupation, avg(salary) from person group by occupation;
select occupation, avg(salary) from person group by occupation having avg(salary) > 500;
-- aggregate functions, operate on groups of data rather than a single value:
select occupation, max(salary) from person group by occupation;
select occupation, min(salary) from person group by occupation;
select occupation, sum(salary) from person group by occupation;
select occupation, count(salary) from person group by occupation;

-- scalar functions which operate on a single value:
select upper(name) as upper_name, lower(name) as lower_name, length(name) as length_name from person order by length_name ;










