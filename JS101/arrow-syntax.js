// in 2015 a new syntax was added for wrinting functions
// arrow syntax

function hello(name){
    console.log("Hello "+name);
}

const hola = function(name){
    console.log("Hola " + name);
}

//Arrow syntax
const bonjour = (name) =>{
    console.log(name)
}

const add = (num1, num2) =>{
    return num1 + num2;
}

// if your function body is a one liner. You do not need a return and curly brackets
const mulitply = (num1, num2) => num1 * num2;

//console.log(mulitply(9,10));//90

// if the function only takes in one input. the parentheses are optional
const gutentag = name =>{
    console.log("Gutentag " + name);
}

const farenheitTemps = [10,50,100,-34,-10,50];
const positiveCelciusTemps = farenheitTemps.map(t => (t-32)*5/9).filter(t => t>0);

// arrow functions and function keyword functions can be used synonomously in code
// the this keyword DOES NOT work the same between the two.
// if you are using 'this' you want a function keyword function