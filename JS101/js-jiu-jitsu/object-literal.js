
let fname = "Adam";
let lname = "Ranieri";

// const person = {fname:fname, lname:lname};
// identical to
const person = {fname, lname}; // you can directly put variables in an object literal. They key will be the variable name
console.log(person)

// you do not have to do  key:value for functions. you can directly name the function
const jim = {
    fname: "Jim",
    hello(){
        console.log("My name is " + this.fname)
    }
}

// Object destructing 
const player = {name:"Tebow", position:"QB"};

//const position = player.position;
// identical to
const {position, name:playerName, team ="Gators"} = player; // object deconstruction
console.log(position)
console.log(playerName)
console.log(team)