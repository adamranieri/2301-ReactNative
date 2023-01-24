// JS Functional programming language
// the core principle of functional programming is that Functions are 1st class objects
// FUNCTIONS ARE OBJECTS
// functions can be pass in as parameters to other functions like any other variable

// this syntax is really a shorthand for declaring a variable and putting a function in it
function hello(){
    console.log("Hello");
}
// functions can be stored in variables
let hola = function(){
    console.log("Hola");
}

function repeatTwice(func){
    func();
    func();
}

// I am not invoking hello at line 21. Invoking or executing the function is done with ()
// passing in the value/defintion of that function

// the function passed into a function is called a callback function
// hello is the callback
// the function that recieves the callback function is called higher order function
repeatTwice(hello);

repeatTwice(hola);

//functions that are defined without a name or being put in variable. Directly passed into a function. are anonymous functions
repeatTwice(function(){
    console.log("Gutentag")
});