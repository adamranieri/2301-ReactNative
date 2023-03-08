## Spring Boot
- Convention over Configuration
    - Instead of manually configuring everything about our application, Spring Boot takes an opinionated stance on what our projects will most likely look like based on what dependencies we include
        - For example, if we use Spring Web to set up a RESTful server, Spring Boot lets us have an embedded server and alleviates the need for us work with Servlets
- Lets us rapidly develop applications
    - Spring Initializer is a useful tool
        - start.spring.io
        - lets us set up metadata (title, versions, etc.), pick our dependencies, and it generates our project for us
- Annotations
    - Annotations themselves aren't specific to Spring Boot applications
        - But we're moving away from XML configuration
    - @SpringBootApplication
        - @ComponentScan - scan the package for classes annotated with @Component so we know which beans are going to be in the application
        - @Configuration - allows for extra configuration
        - @EnableAutoConfiguration - auto configuration updates our configuration based on dependencies that we have

### Spring Initializer
- Maven as package/dependency manager
- Meta-Data like company, description
- Select Jar
- Java 11
- Dependencies
    - We can select Web, and Lombok for now
    - We will pick more later like Spring Data
    - If we click on "Explore" we can view a preview of the project (including the pom.xml) before we download it

### Enterprise Applications
#### Set Up
- Setting up package structure
    - good for organization
    - Controller layer - RESTful endpoints
    - Service layer - Business logic
    - Data/Repository layer - handles updates to the database
    - Entity/Model - data that we pass around
    - DTO - Data Transfer Object - if we have to send multiple pieces of data in one request (for example: a Pet object and a Person object)
    - Exception - if we have any custom exceptions
- Define entities and properties
    - With Lombok, a lot of the boiler-plate code is lessened for us
- 


