## Spring Web

### Model View Controller Pattern
- Model - data that we're passing around (entities/models), encapsulating the data that we want to send to service, data later, etc.
- View - What the user sees
    - In this curriculm, we've been using ReactJS to create our views in the form of web pages
    - But we can also set up views
- Controller - Controlling/Determining where our requests go
    - Controller will invoke some service method
    - We set up patterns to match the request
    - /pets => we want to see pets
    - /persons => we want to see person objects
- Dispatcher Servlet dispatches requests to the proper controller/servlet
    - With Spring Boot, this is set up for us
- View Resolver that indicates where/how to get the views
    - But since we're building RESTful servers that just send JSON back and forth anyways, we don't create the views in our server, we leave that up to React

### Annotations
- @Controller - indicates this class is a controller, one of the stereotypes
- @RestController - indicates that this is a controller and includes @ResponseBody
- @ResponseBody - indicates that we want to return something from the methods (in this case JSON)
- @RequestMapping - sets up a mapping for a method
    - we pass in the value and method type
    - We can also apply this to a class to give a general prefix to every method in that class
- @GetMapping , @PostMapping, @PutMapping, @DeleteMapping
    - shortcut for RequestMapping and specifying method type
- @PathVariable - lets us parse variables from any path variables in the request
    - used for ids
- @RequestBody - whatever parameter we apply this to should get the values from the body of the request
- @RequestParam - lets us parse request parameters from the endpoint:
    - Don't want to use this for passwords, sensitive data
    - We don't want to use this for complex objects, better to use in body where we can write it in JSON


### Status Codes
- 100s - informational
- 200s - success
- 300s - redirect
- 400s - client side error
- 500s - server side error