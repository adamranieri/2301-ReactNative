## Good Design Principles
- Collections should be pluralized
    - /pets -  will return all pets
    - /pets/1 - should return only the pet with id 1
- No verbs
    - We can specify what the "verb" is using HTTP methods
    - POST should insert data
    - DELETE should delete data
    - PUT should update data
    - GET should retrieve/read data
    - PATCH should updates a particular part of the data (not like the whole thing like an UPDATE would)
    - Example, if we had a POST request called insertPet, the "insert" would be redundant because we already know that is is an insert due to it being a POST request

## Postman
- We can only execute GET requests in our browser's address bar
- With Postman, we can specify which verb we want, what variables, and more
- We could also do it through React/front-end
- We can create collections
    - In these collections, we can create folders
    - Right-click and add request
    - In these folders/collections, we can create requests where we specify
        - Method Type - POST, GET, PUT, DELETE
        - Endpoint
        - Request Parameters
        - Request Body - use the request body for sensitive data like passwords and also for complex JSON that we can't send in request parameters/path variables
        - Give the request itself a name so we can identify it
- Make sure to save when using Postman

### REST Constraints:
REpresentational State Transfer
1. Client-Server Architecture
- Our client is built using React
- Our Server is our Spring Boot and it serves data to client
2. Statelessness
- The server itself should not keep track of state
- We can keep track of state on the client side
    - Cookies
    - Session Data
    - Local Storage
- The data itself is persisted in a database (not the server)
- Every time the server gets a request, that request should have everything the server needs to know
- Server shouldn't have to remember anything
3. Cacheability
- Data can be cached by the client
- We can also categorize our responses as being cachable or non-cachable
- We used react-query to cache/invalidate caches of the data
4. Layered System
- Our server is broken up into different layers and services
    - Controller
    - Service
    - Repository
5. Code on Demand (optional)
- The server can serve code to be executed on the client side/browser
- Save on server's processing power
- Example sending some JS script
6. Uniform interface
- Resource identification
    - GET request to /pets should return a list of pet objects, not people
    - Utilize HTTP endpoints to indicate what the request is doing
- Resource Manipulation
    - Post/Put/Delete can be used to modify our data
    - PUT request to /pets should update the pets
    - POST should insert data
    - DELETE should delete some data
- Guidelines:
    - pluralize collections
        - /pets - all the pets
        - /persons/1/pets - the pets that person with id 1 owns
    - Use path variables to indicate identifier
        - /pets/4 - should refer to pet with id 4
    - Don't use verbs, rely on HTTP Verb type
        - Instead of /pets/add, we can just do a POST request to /pets
        - Eliminates redundancy
    - Making the endpoints descriptive
        - Don't want /entity1, /entity2
        - We have no idea what the data is so we should use /pets, /people, etc.
