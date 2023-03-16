# SQL Practice
There is a high chance you will be asked to write an SQL query in your interviews: these exercises below are designed to help you become more comfortable with different queries you may be asked to write. The chinook database is a practice database that you will use for these exercises: Run the script found in the link in your DB to get it set up (NOTE: this just creates the table and data needed for these exercises to work).
https://raw.githubusercontent.com/lerocha/chinook-database/master/ChinookDatabase/DataSources/Chinook_PostgreSql.sql

3/6/2023:
- Joins
    - Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId
    - Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
    - Create a right join that joins album and artist specifying artist name and title.
    - Create a cross join that joins album and artist and sorts by artist name in ascending order.
    - Perform a self-join on the employee table, joining on the reportsto column.
- Set Operators
    - Use a unionall to create a table that has the name of all employees and customers

## Java Exercise
- Sudoku Solver Challenge
    - https://leetcode.com/problems/valid-sudoku/
- Make sure to hit run to test against 3 or so test cases
- One all these pass, hit submit and make sure it passes all of the test cases

## Submission
- Copy + Paste the SQL code into DBeaver and run it to populate your database
- Write the queries to fulfill the questions
- Submit the sql to a repo
- At EOD, we will want to shut down our instance
- I will call people back in at 5 EST.