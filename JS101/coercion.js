// JS has no rules regarding variable assignment

// Dyanmically typed. You do not declare the type variable
a = 2;
a = "Hello";
a = true;
//console.log(a); // true

// Loosely typed
// JS will intrisically turn data types into other data types based on the context
x = 100;
y = "150";
z = x + y;
//console.log(z);// 100150 x was coerced into a string and then the strings were concated to make "100150"
z = x - y;
//console.log(z);// -50 y was coerced into a number and then a subtraction between the numbers occured

// JS WILL FIND A WAY
result = 100 - false / "40" + true; // 101
//console.log(result);

//console.log(50 == "50");//true

// Everything in JS has instrinsic true or false values called
// truthy falsy
// console.log(Boolean("Hello")); // true
// console.log(Boolean(200)); // true
// console.log(Boolean(0)); // false

// The falsy values (they are all false because they represent nothing in a way)
console.log(Boolean(0));
console.log(Boolean(""));
console.log(Boolean(null));
console.log(Boolean(undefined));
console.log(Boolean(false));
console.log(Boolean(NaN)); // not a number

// COMMON GOTCHA
console.log(Boolean("false"));// true

a = (-100)**(1/2); 
console.log(a); // NaN not a number
console.log(typeof a)// the type of not a number is number

// comparisons in JS can be weird
console.log(100 == "100"); // true
console.log("" == false); // true

console.log( 0 == "0"); // true
console.log(0 == false); //true
console.log("0" == false); // true

// JS type coercions were so terrible they invented a new operator that checks the value and type
console.log(0 === "0");// false

x = NaN;
console.log(x === x);// false NaN in any comparison is always false
