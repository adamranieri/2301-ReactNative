// we can add types to variables
let fname = "Adam"; //fname is a string and always a string. attempting to use it in any other way will be higlighted
// fname = 90; TS Warning
let age = 19;
//age = "19"
const isTrainer = true;
function concatName(fname, lname) {
    const fullName = fname + " " + lname; // most of the time TS will infer the type of a variable. so you do not have to explicitly state it
    // and it will still be type safe
    return fullName;
}
function add(num1, num2) {
    return num1 + num2;
}
// fname = null;
const adam = concatName("Adam", "Ranieri");
console.log(adam);
console.log(adam);
console.log(adam);
// TypeScript is still turned into JS
// type coercion will still occur but TS will warn you about it
// const sum: number = 9 + "20"; // 920 concatination
// console.log(sum);// 
