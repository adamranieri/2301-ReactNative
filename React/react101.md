# React
[Mass Effect Fan Site](https://github.com/adamranieri/mass-effect-fansite)

## The problem
- Web Page/ UI development is hard
  - Web Page can become very complex
  - Web Pages can become huge
    - thousands of lines of html/css/js
- The UI and the internal JS state are ***NOT REACTIVE***
  - Editing one does not alter the other unless the developer explicitly code it
  - This leads to alot of bugs
    - Think of all the manual rendering you have to do to keep your JS variables in sync with the UI
- Vanilla JS for DOM manipulation is not developer friendly
  - Manually creating nodes and altering their values is a total schlep

## React Philosophy
- It's name literally comes from the **REACT**ive aspect of state management
  - Data should be treated as immutable objects that get replaced rather than updated
  - Data can only flow down in the application
- HTML/CSS/JS are so instrinsically linked to each other in modern web pages that they *SHOULD* meld together
  - React invented JSX JavaScript Extension as an HTML/JS hybrid for writing web pages
- Component based
  - Break down a web page into small reusuable UI chunks
- Single Page Application
  - There is only a single HTML file in your entire application
  - JS will dynamicallly swap out html/css to make it appear like there are multiple pages
- React is a library and unoppionatd on how to use it
  - React does not come with in built support for many things we associate with web pages
    - There is no in built way to to do routing
  - Other frameworks link Angular are very oppionated.
    - You must write code exactly to their style and it comes with everything you need for profession web pages
- React was developed by facebook

## Anatomy of a new React Project
- package.json
  - Main config file 
  - Contains all the dependencies for a project
- package-lock.json
  - For computers to parse
- README.md
  - just a file for notes
- tsconfig.json
  - Information about how your TS will transpile
- node_modules
  - Where the dependencies for the app are stored
- public
  - Gets the name public because this is the content for anyone to see
  - Where the one html file that react generates comes from
- src
  - Where you will write your components and code that build your application

### JSX or TSX
- JavaScript Extension
  - an HTML/JS hybrid syntx
- called tsx if you are using typescript
- Becase JSX is essentially JS we can use JS variables easily in our JSX

### Component Based
- In React a component is a function that returns JSX
  - That is it
  - You have have to return a single root tag
  - You can use an empty tag as a React Fragment to avoid unecessary divs and tags
- By convention react apps always have a root component called App
  - function that returns JSX
- Components can be nested
  - Components can use other components