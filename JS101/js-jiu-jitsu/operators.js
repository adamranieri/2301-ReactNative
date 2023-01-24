// logical operators do NOT function how you expect them to
// | and & do not return true or false. They return the truthy or falsy value
const result = "" | 100; 
console.log(result); //100

// nullish operator
let fname = "Kim";
fname ??=  "No name"; // assigns the value if null
console.log(fname)

function greet(person){
    person.fname ??= "No First name";
    person.lname ??= "No last name";
    console.log(person)
}

const adam = {fname:"Adam"};

greet(adam)