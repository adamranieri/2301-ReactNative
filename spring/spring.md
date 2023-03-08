## Spring

### What problem(s) does Spring address?
- Java is Object-Oriented
- We make classes and objects
- These objects all work together and depend on each other
    - Service class depends on Data class
    - Animal Class depend on Owner class and vice versa
    - As we get to enterprise level apps, managing the dependencies and connections between classes can tricky
### Spring Overview
- Spring is good at managing Beans, which are Java objects
    - Dependency Injection
        - Instantiating, configuring dependencies between classes
    - IoC - Inversion of Control - instead of the objects themselves controlling injection, instantiation, etc.
        - This responsiblity is passed to the Spring framework
            - We still have to configure some things but Spring makes the configuration centralized or easy to use
- POJO - Plain Old Java Object
    - There's nothing special about the objects we create
    - Along with some configuration data, Spring manages these objects
- Bean - any object that Spring is managing
- Loose Coupling - we don't want our dependencies to be tightly reliant on one another in the sense that if we change one object, we don't want changing the other objects to be a big hassle

### Spring Family of Projects
- Spring contains many projects in which we have modules
    - Data Access
        - JDBC - Connect Java app to a database
        - ORM - Object Relational Mapping - helps convert Java objects to tables in our database
        - Transactions - helps us manage transactions - which is a set of commands that we execute
    - Web
        - Web - set up endpoints and an HTTP server to listen to requests from our front-end    
        - Servlets - underlying technologies for setting up our web server
    - Core Container
        - Beans - the objects that Spring manages, BeanFactory helps us create beans
        - Context - ApplicationContext - also helps create beans with some additional functionality
        - Expression Language

### IoC
![IoC Diagram](https://1.bp.blogspot.com/-BOuTHQx-pLM/X9GckR3esnI/AAAAAAAAk7I/WxKZefopkeENioYyBxKBwKzq6crsZhcjQCLcBGAsYHQ/w1200-h630-p-k-no-nu/Spring%2BDependency%2Binjection%2BIOC%2BContainer%2Bexample.jpg)
- Spring helps us focus on the business aspect of the application
    - Defining our objects
    - Business specific logic
    - Don't worry as much about how the dependencies are injected/managed

### Configuring Beans
#### XML-based configuration
- Define our beans in an xml file
- All the configuration is one place, so it's easy to find all of the configuration at once
- Also a downside, because it could be hard to find specific bean you want

#### Annotation-based configuration
- Using annotations in our code to specify beans, dependencies
- Readable code because the annotations are directly in our classes that we create
- Won't have all of the configuration in one place

#### Java-based configuration
- We create classes and use some annotations to control/configure the 


### Injection
#### Setter-based Injection
- We use setter methods to give values to different values
- Requires a no-arg constructor because this will be used to create a "blank" object which the properties are then used to fill out
- We don't need to set all fields
#### Constuctor-based Injection
- We need to include all arguments that are in the constructor parameters because the constructor needs real values as parameters when it's being invoked
- Don't necessarily need a no-arg constructor to be created because it's using the all-args constructor

### Scopes
1. Singleton(default) - each bean definition is scoped to a single object instance per Spring container
2. Prototype - multiple instances per bean definition (objects that have state that we need to keep track of)


### Stereotypes
Annotations let us inform Spring that the annotated class is a bean
- @Component - the base annotation while the others are more specialized versions
- @Controller - use for our controllers
- @Service - use for our service classes
- @Repository - use for our data layers