
// JS is a functional programming.

function hello(){
    console.log("Hello World");
}

function hola(name){
    console.log("Hola " + name);
}

hola("Adam");
hola("Brian");

// there are no protections regarding data types passed into a function
hola(89);

hola();// you can call functions with incorrect numbers of parameters, 
// functions called with incorrect amount of parameters will default to undefined
hola("Mike", 90, "Q", false, false); // the extra parameters are just ignored

// functions can have default parameters
function gutentag(name = "Johan"){
    console.log("Gutentag " + name);
}

gutentag();

// overloading does not exist in JS. Functions of the same name will replace older versions
function gutentag(){
    console.log("Seprate funciton");
}

gutentag("Hanz");