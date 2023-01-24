// An array is a ordered list/array of elements in JS
// JS does not have tuples or sets or maps*. There are no types of arrays.
// arrays are 0 indexed
const people = ["Adam", "Bill", "Charles", "Dean"];

// iterate over an array using a for loop and the index
for(let i = 0; i < people.length; i++){
    console.log(people[i]);
}

// convienient syntax for looping through an array
for(const person of people){
    console.log(person);
}

const anything = [
    10,
    "A", 
    true, 
    null, 
    null, 
    200
];

for(const value of anything){
    console.log(value);
}

// Common operations for arrays
const guests = [];

// Add
guests.push("Hank");
guests.push("Dale");
guests.push("Bill");
guests.push("Boomhauer");
console.log("added to the array", guests);

// Remove
// guests.pop();// removes the last element
// console.log("remove last element", guests);
guests.splice(1, 1);
console.log("Remove", guests);

// Add at index
guests.splice(1,0, "Peggy1", "Peggy2", "peggy3")
console.log("Added at index", guests);


