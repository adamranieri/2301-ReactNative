### BeanFactory vs ApplicationContext
- Both are responsible for managing beans
#### BeanFactory
- Lazy Loading - beans are loaded when needed
- Supports Singleton and Prototype scopes

#### ApplicationContext
- Eager Loading - all beans are loaded up in the beginning
    - trick for remembering: If you are applying yourself, you're not lazy, you're eager
- More suitable for enterprise-level applications
    - Supports all bean scopes - Singleton, Prototype, Request, Session, GlobalSession
    - Annotation-based dependency injection
    - Easy integration with AOP
        - Aspect Oriented Programming
    - Automatically registers BeanFactoryPostProcessor and BeanPostProcessor
        - BeanFactoryPostProcessor - allows for custom modification of bean definitions, https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanFactoryPostProcessor.html
        - BeanPostProcessor - custom modification of new bean instances, https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanPostProcessor.html


### Beans
- An object managed by Spring IoC Container
- Beans are objects with a lifecycle that get handled by the spring frameworks. Entities are just filler objects for moving data to and from a datatbase.
- ![IOC Container](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/images/container-magic.png)
- ![Bean Creation](https://s3.ap-south-1.amazonaws.com/myinterviewtrainer-domestic/public_assets/assets/000/000/841/original/Dependency_Injection.png?1628693939)

#### Bean Scopes
- Singleton - default scope, scopes a single bean definition to a single instance
    - If we created a bean with singleton scope, wouldn't be good for a stateful object because it would be impossible to make different instances with different values
    - ex: Controller, Service, Repository
- Prototype - scopes a bean definition to any number of instances
    - Good for stateful objects
##### Only available in ApplicationContext
- Request - scopes a bean definition to a single HTTP request
- Session - scopes a bean definition to HTTP Session
- GlobalSession - scopes a bean definition to a global HTTP Session

#### Bean Lifecycle
- ![Bean Lifecycle](https://media.geeksforgeeks.org/wp-content/uploads/20200428011831/Bean-Life-Cycle-Process-flow3.png)

### Dependency Injection
- Constructor-Based
    - WIth XML, we saw constructor-arg tags
    - With annotations, we would see the annotation over the constructor of the class
- Property-Based
    - With XML, we saw property tags
    - We would see the annotation over the field of the Java class
    - This is what we see a lot in our Spring Boot applications
- Setter-Based
    - We would see the annotation over the setter of class
- https://www.educba.com/dependency-injection-in-spring/


### Spring MVC
- ![Spring MVC](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5oXWIkV4RZFLe9ow_VXNn2pxEzex2IO_UWi48fIChLw&s)

#### Dispatcher Servlet
- Receives all the HTTP requests and delegate them to the correct controller
- WIth Spring Boot, we have the Dispatcher Servlet configured for us
- But without we can manually set up:
    - Declaring the servlet in a web.xml
    - Setting up the package to scan for our controllers

#### View Resolver
- Helps the application to identify and locate the views that we want to display
- Given "hello" => views/hello.jsp
- Only in the context of the back-end handling the views as opposed to having a front-end (React) app handling everything
- For our applications, we wouldn't have to worry about a View Resolver because our controllers are RESTful and they're only returning data
    - Then the front-end app decides what to do with that data

#### @RestController vs @Controller
- RestController is used for RESTful applications
    - Specifically @RestController = @Controller + @ResponseBody
    - @ResponseBody indicates that we want to return some data from our Controller methods, as opposed to returning the view that we want to display

    
### Annotations
- @Configuration - used to mark a class as a source of the bean definitions. Beans are the components of the system that you want to wire together. A method marked with the @Bean annotation is a bean producer. Spring will handle the life cycle of the beans for you, and it will use these methods to create the beans.
    - set up a class that contains methods that produce beans
- @ComponentScan -use to make sure that Spring knows about your configuration classes and can initialize the beans correctly. It makes Spring scan the packages configured with it for the @Configuration classes.
- @Component - Another way to declare a bean is to mark a class with a @Component annotation. Doing this turns the class into a Spring bean at the auto-scan time.
- @Service - Mark a specialization of a @Component. It tells Spring that it's safe to manage them with more freedom than regular components. Remember, services have no encapsulated state.
- @Autowired - To wire the application parts together, use the @Autowired on the fields, constructors, or methods in a component. Spring's dependency injection mechanism wires appropriate beans into the class members marked with @Autowired.
- @Bean - A method-level annotation to specify a returned bean to be managed by Spring context. The returned bean has the same name as the factory method.
    - indicates that a method will return an object that will be registered as a bean and managed by the Spring container
- @Value - used to assign values into fields in Spring-managed beans. It's compatible with the constructor, setter, and field injection.
    - For example, manually specify value of 1 for an id field
- @Scope - used to define the scope of a @Component class or a @Bean definition and can be either singleton, prototype, request, session, globalSession, or custom scope.

#### Spring Web Annotations:
- @Controller - marks the class as a web controller, capable of handling the HTTP requests. Spring will look at the methods of the class marked with the @Controller annotation and establish the routing table to know which methods serve which endpoints.
- @ResponseBody - The @ResponseBody is a utility annotation that makes Spring bind a method's return value to the HTTP response body. When building a JSON endpoint, this is an amazing way to magically convert your objects into JSON for easier consumption.
- @RestController - Then there's the @RestController annotation, a convenience syntax for @Controller and @ResponseBody together. This means that all the action methods in the marked class will return the JSON response.
- @RequestMapping(method = RequestMethod.GET, value = "/path") - The @RequestMapping(method = RequestMethod.GET, value = "/path") annotation specifies a method in the controller that should be responsible for serving the HTTP request to the given path. Spring will work the implementation details of how it's done. You simply specify the path value on the annotation and Spring will route the requests into the correct action methods.
    - Class-level - gives a prefix for all methods in that class
    - Method-level - indicates the endpoint for that method
- @RequestParam(value="name", defaultValue="World") - Naturally, the methods handling the requests might take parameters. To help you with binding the HTTP parameters into the action method arguments, you can use the @RequestParam(value="name", defaultValue="World") annotation. Spring will parse the request parameters and put the appropriate ones into your method arguments.
- @PathVariable("placeholderName") - Another common way to provide information to the backend is to encode it in the URL. Then you can use the @PathVariable("placeholderName") annotation to bring the values from the URL to the method arguments.
- @RequestBody - allows us to map the body of the HTTP request to the parameter of our Controller method

#### Spring Data Annotations:
- @Transactional - desrcibes a transaction on a method or class
    - Transactions are a set of commands
    - For example, we can set a transaction as readonly
- @Query - lets us write custom query on a method signature in our repository

#### JPA Annotations (NOT INHERENT TO SPRING)
- @Entity - declares that a class should be mapped to a relation
- @Id - marks a field as a primary key
- @GeneratedValue - indicates that the field should be generated by the database
- @Table - allows us to configure the table that is created
- @Column - allows us to configure the column that is created

#### Spring Boot Annotations:
- @SpringBootApplication - combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
- @EnableAutoConfiguration - tells Spring Boot to “guess” how you want to configure Spring, based on the jar dependencies that you have added
    - If we have web dependency, set up our embedded server

#### Stereotypes
- @Component lets Spring:
    - Scan our application for classes annotated with @Component
    - Instantiate them and inject any specified dependencies into them
    - Inject them wherever needed
- @Controller - marks the class as a controller
- @Service - marks the class as a service
- @Repository - marks the class as a repository for fetching/manipulating data 
