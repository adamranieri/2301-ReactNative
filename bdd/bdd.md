# BDD Behavior Driven Development

### The Problem
- Most tests revolve around testing specific snippets of code
  - That an action for a reducer works correctly
  - An sort function sorts an array correctly
- The user does not really care if your function works or not
  - Does the behavior of the application actually work
    - As a user, does clicking the delete button actually make the task go away?
    - As a user, does going to the home page show me all my notifications.

### BDD as a solution
- A way of writing tests from the perspective of the User
- Ensure that the application we write meets expectations

### Steps to BDD
1. Write an acceptance test
2. Write a mock that passes the acceptance test
3. Write functionality that passes the acceptance test 
