# API
- An API Web Server can follow any format
  - it can handle jpegs or pdfs
  - You can send information in the form of JSON
  - The urls can be written however you want
- ***localhost is the shorthand for ip 127.0.0.1***
  - This is a reserved IP address which means the local machine
  - node.js can be really picky about using 'localhost' as opposed to the IP

## The Problem
- At a more professional level APIs are designed with standards
  - examples
    - How the URL is formatted
    - The content/type of the http request and response
    - What the status codes codes are for

## The Solution
- A good API should provide an API spec with all the details about the API.
  - The most common standard is **openapi**

## RESTful APIs 
- The great majortity of servers **totally anecdotal** of web servers are REST based
- REST ***RE***presentationl ***S***tate ***T***ransfer
  - Representation
    - You are representating the resource using a common format. Like JSON.
      - The API uses JSON not some arbitraty Python object
  - State
    - The state/data of the resource
  - Transfer
    - HTTP request and HTTP Response system
- RESTful API has a **Uniform Interaface**
- The API is used to access a *collection*/**resource**
  - A resource could be anything
    - doctors
    - cars
    - houses 
    - appointments
  - Any collection of nouns you are keeping tracl of with the API
- The **verb** of the HTTP request is used to dictate what the HTTP Request does to the resource
- CRUD **Create Read Update Delete** operation
  - Create POST
  - Read GET
  - Update PUT (sometimes Patch)
  - Delete DELETE
- Examples
  - GET /cars => should return all of the cars
    - GET /cars/201 => Return just the car with id 201
  - POST /cars => create a new car
  - PUT /cars/101 => update/replace the car whose id is 101
  - DELETE /cars/501 => Delete the car whose id is 501


## GraphQL APIs
- GraphQL is newer than REST
  - Invented by facebook
- Invented to solve some of the problems with REST
  - Over and under fetching
    - Requesting JSONs that had too much information or too little is a common problem with REST APIs
  - REST often exposes data manipulation to the client more than we want
    - Most REST APIS support whole level swaps of a resource with a PUT or a POST having a bunch fields that we don't really want to send but must
- Graph Query Language
  - Invented query language like SQL but for getting information from the API
    - React Query and Graph Query Language have no real link to each other. They just both have query in the name.


