## Front-end
- Build our apps using React
- Access endpoints using fetch API
- In the past, we would use GraphQL endpoints but now we're making our own using Spring
    - Spring Web
    - Spring Data
    - Spring Boot

## CORS
- Cross Origin Resource Sharing
```
Access to fetch at 'http://127.0.0.1:8080/pets' from origin 'http://localhost:3000' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource. If an opaque response serves your needs, set the request's mode to 'no-cors' to fetch the resource with CORS disabled.
```
- We want to add an annotation on our controller to allow this
- @CrossOrigin(origins = "http://localhost:3000")
- We can also use the "*" pattern to allow all origins