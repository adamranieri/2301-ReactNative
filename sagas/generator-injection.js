

function* greetPerson(){
    console.log("Hello what is your name?")
    const name = yield "Enter Name"
    console.log("Hello " + name);
}

const greetGenerator = greetPerson();

console.log(greetGenerator.next())// Enter name// function stops at the yield
greetGenerator.next("Adam Ranieri");// inject a value  into name at line 5 where the yield is


