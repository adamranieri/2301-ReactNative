drop table if exists bank_account;

create table if not exists bank_account (id serial primary key, amount integer check(amount >= 0));

insert into bank_account values(default, 1000);
insert into bank_account values(default, 2000);

select * from bank_account;

-- begin transaction, we want to transfer 100 dollars from account 2 to account 1
begin;
update bank_account set amount = amount - 100 where id = 2;
update bank_account set amount = amount + 100 where id = 1;
commit;

select * from bank_account ;

-- transfer 3000 dollars from account 2 to 1:
begin; 
update bank_account set amount = amount + 3000 where id = 1;
update bank_account set amount = amount - 3000 where id = 2;
-- at this point, we realize that account 2 doesn't have enough money so we rollback:
rollback;

select * from bank_account ;

begin; 
update bank_account set amount = amount + 3000 where id = 1;
update bank_account set amount = amount - 3000 where id = 2;
-- even if we try to commit, the changes will be rolled back because one command failed the constraint so it rolls back the entire transaction
commit;

select * from bank_account;

