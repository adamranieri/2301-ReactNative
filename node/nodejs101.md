# Node JS

## Origin
- JavaScript is the only language in web browser
  - Lots of developers who know JS
- JS developers want to be able to use JS to write applications other than web pages
- Ryan Dahl created a JS runtime environment independent from the browser called node.js
  - He wanted to write a runtime for an event driven langauge that supports asynchronous programming

## Node Basics
- `npm init`
  - Creates a package.json
- ***package.json***
  - core configuration file of any node project
    - Author information
    - name of the application
    - the main file to execute to start the program
    - **Define dependencies**
      - Adding external JS libraries/code to your application
    - **Scripts**
      - Shortcut for commands you want to run for your project
        - examples
          - start
          - test
          - but could be anything
        - You can execute any script by calling `npm run nameofscript`
- *package-lock.json*
  - More specific break our package.json
  - Not designed to be read or edited by humans

## npm
- node package manager
  - The dependency management system that comes bundled with the node.js runtime environment
- npm
  - The world's largest collection of JS libraries
    - For almost anything software related you can find a node library that does it
- `npm install nameofmodule` or `npm i nameofmoulde`
  - Will add the dependency to the package.json
  - download the library code into a folder called node_modules
