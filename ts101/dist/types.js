// TypeScript allows you to create types
// you can have type safety on your objects
const rover = { name: "Rover", age: 1, owner: "Steven" };
function printDoggo(dog) {
    console.log("Name of dog " + dog.name);
    console.log("Owner " + dog.owner);
}
printDoggo(rover);
// types are composition based
// they dont actully make something of that type like a class would
const spot = { name: "Spot", age: 15, owner: "Gary", height: 14 };
printDoggo(spot); // totally okay for TS
