# SQL Practice
There is a high chance you will be asked to write an SQL query in your interviews: these exercises below are designed to help you become more comfortable with different queries you may be asked to write. The chinook database is a practice database that you will use for these exercises: Run the script found in the link in your DB to get it set up (NOTE: this just creates the table and data needed for these exercises to work).
https://raw.githubusercontent.com/lerocha/chinook-database/master/ChinookDatabase/DataSources/Chinook_PostgreSql.sql
- Querying practice
    - Select all records from the Employee table.
    - Select all records from the Employee table where last name is King.
    - Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
    - Select all albums in Album table and sort result set in descending order by title.
    - Select first name from Customer and sort result set in ascending order by city
    - Select all invoices with a billing address like “T%”
    - Select all invoices that have a total between 15 and 50
    - Select all employees hired between 1st of June 2003 and 1st of March 2004
- Insert practice
    - Insert two new records into Genre table
    - Insert two new records into Employee table
    - Insert two new records into Customer table
- Update Practice
    - Update Aaron Mitchell in Customer table to Robert Walter
    - Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”

3/6/2023:
- Joins
    - Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId
    - Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
    - Create a right join that joins album and artist specifying artist name and title.
    - Create a cross join that joins album and artist and sorts by artist name in ascending order.
    - Perform a self-join on the employee table, joining on the reportsto column.
- Set Operators
    - Use a unionall to create a table that has the name of all employees and customers

## Submission
- Copy + Paste the SQL code into DBeaver and run it to populate your database
- Write the queries to fulfill the questions
- Submit the sql to a repo
- At EOD, we will want to shut down our instance
- I will call people back in at 5 EST.