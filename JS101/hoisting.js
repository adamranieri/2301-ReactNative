// JS has a 2 pass sytem for executing code
// when you execute a function
// 1. the default value of undefined is assigned to every declared variable
// 2. the function is executed

function welcome(){

    console.log("Welcome " + person);
    var person = "Tim";
}

welcome();