## Java Study Guide

You should be able to explain and apply the following topics:

### Fundamentals
- Features, benefits, and drawbacks of the Java language
  - WORA (write once, run anywhere)
  - Backed by Oracle
  - Rich APIs (e.g. Collections API)
  - Object-oriented
  - Strongly/strictly typed
  - High level (e.g. memory handled via automatic garbage collection)
  - Verbose
- Stack vs Heap
    - https://www.javatpoint.com/stack-vs-heap-java
- Purpose and contents of the JDK, JRE, and JVM
- Main method signature and significance
- Compiling and executing Java code on the command line
- JavaDocs
- Primitive data types
  - boolean
  - byte
  - char
  - short
  - int
  - float
  - double
  - long
- Operators
  - ternary
  - logical (&&, ||, !)
- Scopes of variables
  - static / class
  - object / instance
  - method
  - block
- Control flow statements
  - for
  - enhanced for loop
  - if/else 
  - while
  - do-while
  - switch
- Class members
  - Fields
  - Methods
  - Constructors
- Access modifiers
  - public
  - protected
  - default
  - private
- Non-access modifiers
  - static
  - final
  - abstract
- Packages and import statements
  - static imports
- this and super keywords
- JRE library classes
  - Object
    - equals, hashCode, and toString methods
  - System
  - String
  - Collections
  - Arrays
- String pool
- == vs .equals()
- Making objects immutable

### OOP
- Object-oriented programming principles
  - Abstraction
    - Abstract classes
    - Interfaces
  - Polymorphism
    - Overloading
    - Overriding
  - Inheritance
    - Inheriting from classes vs interfaces
  - Encapsulation
    - Using access modifiers with getters/setters
- Object vs class
- Abstract classes
  - Difference between abstract and concrete class
- Interfaces
  - Implicit modifiers for variables and methods
  - When to use instead of abstract class

### Collections & Generics
- Collections API
  - Inheritance hierarchy
  - List, Set, Map, and Queue interfaces and their differences
  - Concrete implementations of above interfaces and their differences
  - Using enhanced for loops
  - Comparable and Comparator interfaces
  - Iterable vs Iterator interfaces
- Annotations
  - @Override
- Generics - TBD
  - Generic classes
  - Generic methods
  - Diamond operator and type inference
- Serializable interface

### Exceptions
- Class hierarchy
- Error
- Exception
- RuntimeException
- Checked vs unchecked exceptions
- Handling or declaring exceptions
- try/catch/finally blocks
  - rules for multiple catch blocks

### Java 8
- Functional interfaces
- Lamdba functions
- Default method implementation in interfaces

### Design Patterns - TBD
- Singleton
- Factory

### Maven, JUnit, Log4j
- Maven
  - build automation
  - dependency management
  - maven repository locations (central vs local)
  - pom.xml file and tags
  - Project artifacts
    - group-id
    - artifact-id
    - version
- Test-driven development (TDD)
- JUnit annotations
  - @Test
  - @Before
  - @After
  - @BeforeClass
  - @AfterClass
- Assert class methods
- Testing best practices
  - Dependency injection
  - Writing testable code
  - Mocking - TBD
  - Measuring code coverage
  - Externalize data
  - Deterministic (non-flaky) tests