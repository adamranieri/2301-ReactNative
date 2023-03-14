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

### Spring Boot Dev Tools
- Just include Dev Tools and run the application
- Every time you edit one of the files, the app will restart
```
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
      <scope>runtime</scope>
      <optional>true</optional>
    </dependency>
```

<!--Spring Boot Devtools makes our application restart every time we make a change to our code:-->
-  In intelliJ, we have to enable the auto build
- Ctrl + alt + S, we should see settings -> Build, Execution, Deployment -> Compiler -> Make sure "Build Project Automatically" is checked -
- Can also go to File -> settings
- Now, when we change code in our project, it will re-run automatically
		

### Spring Boot Actuator
- Expose an endpoint that gives diagnostic information about the app
- ex, we can view the application health: http://localhost:8080/actuator/health
- https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html

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


### Properties Files
- For different situations, we might have different configurations and properties
    - Example: We have a production RDS and an H2 testing database
    - Instead of having these both in application.properties and manually commenting them out, we can split them up into 2 or more different files
    - Just make sure they still end with .properties
- To pick between them, we can set this annotation:
    - ```@PropertySource("classpath:test.properties")```