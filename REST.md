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