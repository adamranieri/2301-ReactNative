# HTTP Hyper Text Transfer Protocol
- It is the main way of sending information on the web
  - The definition of a a web application is that it uses HTTP communicate
- HTTP is a request Responese based system
  - ***Client***
    - Person or browser or piece of software that makes an ***HTTP Request***
  - ***Web Server***
    - Computer or application that responds to an HTTP Request with an ***HTTP Response***
    - information and files are stored on web servers

### Anatomy of an http request and Response

##### Request
- Version of HTTP it is using
  - Pertinent if you get trapped in a time loop to the early 2000's
- URL
  - Uniform Resource Locator
  - Wherever the HTTP request is going
- Verb
  - The of HTTP request
  - The verb describes what the request is *supposed* to do
    - get
      - Get or read information back from a server
    - post
      - Send information to a server to create somthing
    - put
      - Send information to update something on a web server
    - delete
      - Send information to delete something on a web server
- Body (optional)
  - The information you are sending with the request
- Headers
  - Key value pairs that are *meta information* about the request
    - Authentication is a big example

##### Response
- Status Code
  - How a request was handled by a web server
    - 100's
      - Information
    - 200's
      - Successfully completed the request
    - 300's
      - Redirected
    - 400's
      - Client makes a mistake in sending the request
      - 403
        - forbidden
        - You do not have access
      - 404
        - Not found
      - 405
        - unauthorized
        - You are not logged in
      - 415 
        - No teapot
      - 451
        - Not avaiable due to government censorship
        - named after the book Farenheit 451
    - 500's
      - Server encounters an error when processing the request
- Body
  - Information sent back in the request
    - String
      - JSON
    - File
      - Html
      - CSS
      - JS
- Headers
  - Key value pairs that are meta information for the response
  

## JSON JavaScript Object Notation
- String version of a JavaScript Object
- Why do JSONs exist?
  - Web Servers can be written in any language
  - Web Servers need to be able handle HTTP requests
    - Web Browsers are the biggest HTTP client in the world
  - If you are sending data to a Python Web Server python would have no idea what to do
    - If a python web server sent back a Python object to the web browser as the HTTP response
      - The JS in the browser would have no way to use it
- There was one data type that just about every programming language supports.
  - ***Strings***
  - Strings are supported by almost programming language
  - Programming languages can parse JSONs into their own specific objects for that language
- JSONs are for transporting and storing data
  - ***Reading and writing JSONs will be a huge skill that you learn***
  - functions are excluded when an object is turned into a JSON
    - A python application would have no way of running a JS function
    - JSONs are for passing **data** not **code**

- Many web servers DO NOT return HTML or CSS.
- They return JSONs
  - Just data
- Web Servers that send and recieve JSONs have an ***API***
- Application Program Interface
  - The API of a web server is the part of the `application` that you `interact` with `programatically`
    - Programatically means making HTTP request with a programing language


## Asynchronous Operations async await
- Real life Example
  - If you are hosting a party their are several things you have to do
    - Clean up the living room
    - Put drinks in the fridge
    - Order a pizza to be delivered
      - Pizza arrives asynchronously
    - Put out plates for everyone
    - Put the game on the TV.
- HTTP requests are like ordering a pizza
  - The reponse could take a long time to get back to the browser
  - We can use a special `async` `await` to wait on snippets of code that execute asynchrously
    - A Promise is a wrapper around a value that can be awaited.
    - A promise represents a value that will eventually exist