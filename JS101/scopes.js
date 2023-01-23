// variables can have 3 scopes in JS
// 1. global Almost never use global variables. name collision, rewrite a variable being used elsewhere. the value is not what you expect
//  (no keyword)
// 2. function NEVER use the var keyword Friends don't let friends use var
// var keyword
// 3. block scope
// let or const
// const means you cannot REASSIGN the variable. You can still edit the variable. The variable is still mutable.
// for arrays you can add or remove elements. Objects you can alter or change the values on objects

// the keyword used to create the variable defines the scope/lifetime of the variable

function greet(fname, lname){

    fullName = fname +" "+ lname; // fullName is a global variable. It exists for entirety of the program and anyting access it
    console.log(fullName);
}

greet("Adam", "Ranieri");
console.log(fullName); // access to the global fullName outside the function



function hola(fname, lname){

    if(true){
        var fullName2 = fname + " " + lname; // var makes the variable funciton scoped
    }
    
    console.log(fullName2);
}

hola("Rory", "Eiffe");
//console.log(fullName2);// not defined

function bonjour(fname, lname){

    let full;
    if(true){
        full = fname + " " + lname; // let is block scoped. Cannot escape the curly brackets it was defined in
    }
    console.log(full); // not defined
    const value = "Finished"; // const has the same scoping rules as let but you cannot reassign t
}

bonjour("james", "Smith");