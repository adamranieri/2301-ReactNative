## Java 8
- Introduced a lot of new features:
    - Lambda expressions
        - Similar to arrow functions in JS

### Lambda Expression
- parameters
- expression, code block 

#### Syntax for Lambda expressions
- parameter -> expression
    - takes in a single value and returns a single expression
- (parameter1, parameter2) -> expression
    - takes in multiple parameters and returns an expression
- (parameter1, parameter2) -> {code}
    - takes in multiple parameters and executes some code

### Fuctional Interfaces
- An interface with a single abstract method
- We can use these to store lambda expressions
    - When we write lambda expression, we want to adhere to the method signature of the FI
- Built-In Functional Interfaces:
    - Consumer - takes in a value and doesn't return anything
        - ex: take in a string and print it out
    - Predicate - takes in a value and returns a boolean
        - ex: takes in a number and returns even/odd
    - Function - takes in a value and returns a value
        - square/cube function that takes in an integer and returns an integer squared/cubed
    - Supplier - doesn't take in a value but does return a value
        - ex: returns a random number
    - Bi-Versions -  
        - BiConsumer takes in 2 values
        - BiPredicate takes in 2 values
        - BiFunction takes in 2 values
    
### Streams
- A way to process collections in Java
- Intermediate Operations
    - map - apply some function to every element in the collection
        - takes in a function
    - filter - filter the elements based on some predicate/condition
    - sorted - sort the elements
- Terminal Operations
    - forEach - apple some function to the returned elements from the stream (Ex: print out, etc.)
        - takes in a consumer, performs an operation, but doesn't return anything
    - collect - take in the values from the stream and return it as a new collection
    - reduce - reduce all of the elements into a single value (sum, count, product)