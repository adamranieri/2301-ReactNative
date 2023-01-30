// TypeScript allows you to create types

type Dog = {name:string, age: number, owner:string};

// you can have type safety on your objects
const rover: Dog = {name:"Rover", age:1, owner:"Steven"};

function printDoggo(dog: Dog): void{
    console.log("Name of dog " + dog.name);
    console.log("Owner " + dog.owner);
}

printDoggo(rover);

// types are composition based
// they dont actully make something of that type like a class would

const spot = {name:"Spot", age:15, owner:"Gary", height:14};

printDoggo(spot);// totally okay for TS
// TS only cares that the object passed in has the properites of type Dog
// not that you explcitly label it as a dog

//types you define in TS are non-existent whey transpiled into JS
// types exist soley for type safety while writing code

// Not existent in the JS
type Player = {
    id: number,
    position: string,
    jersey: number,
    fname: string,
    lname: string
}