-- create an intern user:
create user intern with password 'password';

create table financial_information (id serial primary key, amount integer);

insert into financial_information values (default, 100000);
insert into financial_information values (default, 200000);
insert into financial_information values (default, 300000);
insert into financial_information values (default, 400000);

select * from financial_information ;

-- because we have an intern, we want them to only be able to view the information, but not modify it:
grant select on financial_information to intern;
revoke insert, update, delete on financial_information from intern;

-- to try this out, we need to login as the intern by making a new connection
-- Just have to change the username/password and include the same endpoint, port, database
-- Make sure we switch to intern connection and then we won't be allowed to insert/update/delete on the financial table

delete from financial_information ;





