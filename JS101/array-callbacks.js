// Arrays have a lot of higher order functions
// using them will greatly simpify your code

function greet(name){
    const greeting = "Greetings to you " + name;
    console.log(name);
}

const people = ["Hank", "Lucky", "Bobby", "John Red Corn"];

// imperative loop approach
// for(const person of people){
//     greet(person);
// }

// greet is the callback. forEach is the higher order function
//people.forEach(greet);// for each element in the array. the element will be passed into the greet function and invoked;

function farenheitToCelcius(temperature = 0){
    const celcius = (temperature - 32)*5/9;
    return celcius;
}

const temps = [212, 40, 0, 32, -75];

// const celciusTemperatures = [];
// for(const t of temps){
//     celciusTemperatures.push(farenheitToCelcius(t));
// }
// console.log(celciusTemperatures)

// map is a higher order function. It takes in a callback that takes in one input and returns one output
// map will create a NEW array where every element in the old array has been passed through this function
const celciusTemps = temps.map(farenheitToCelcius);
//console.log(celciusTemps);

function isPositive(num = 0){
    return num >= 0;
}

// filter is a higher order function that takes in callback function that has an input and returns true or false.
// if the return is true it is put into a new array. If false it is not put into a new array
const positiveTemperaturs = temps.filter(isPositive);
console.log(positiveTemperaturs);
console.log(temps);// old array is untouched

// using map and filter can GREATLY reduce the size of your code.

// chaining is very common to see in JS
temps.map(farenheitToCelcius).filter(isPositive).forEach(function(temp){
    console.log("The temperature is " + temp);
});