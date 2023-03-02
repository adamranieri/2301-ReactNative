## JUnit
- a framework in Java that lets us write unit tests for our code
- testing our program in the smallest increments/pieces as possible
- In Java we usually write unit tests that test a particular method
    - Given some input, make sure it returns the correct output
- JUnit is an external dependency, we can't access it without first installing it

### Setting up a project
- With maven, if we choose maven-archtype-quickstart, we should get JUnit already installed
    - But if not, we can go on mvnrepository.com to get the JUnit dependency and put it in our pom.xml between the <dependencies> tags
- We usually want to mimic our main directory in our test directory
- If we had a Calculator class in our main directory, we would want a CalculatorTest class in our test directory

### Annotations (Jupiter Annotations)
- @Test - we use it to annotate methods, indicating that the method is testing something (usually a method from main directory)
- @BeforeAll - we use it on a static method, to indicate that it should run before all the tests in that class are run
    - We can use this to do any set up we need at the beginning of all testing methods of that particular class
- @BeforeEach - we annotate a non-static method to indicate that this method should run before every test
    - initialization before each test (ex: maybe resetting a value)
- @AfterAll - clean up after all tests are run
- @AfterEach - clean up after each individual test

### Junit vs Jupiter
- Instead of BeforeEach, we get Before in JUnit
- Instead of BeforeAll, we get BeforeClass in JUnit
- In JUnit we can use Assert.assertEquals (or any of the assert methods)

### Testing Methods
- assertEquals - ensure that 2 values are equal, otherwise the test fails
- assertTrue - ensures that the value returns true
- assertArrayEquals - ensures that 2 arrays have the same length and the same values
- https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html

### Test-Driven Development (TDD)
- Writing tests before we write our code
- Benefits
    - Helps us write good code
        - Identify edge cases
        - Helps to point out awkward method declarations
        - Identify areas to improve
    - Nice workflow and lets us see tangible progress as we fill out our methods