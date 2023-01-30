
// we can add types to variables
let fname: string = "Adam"; //fname is a string and always a string. attempting to use it in any other way will be higlighted
// fname = 90; TS Warning

let age: number = 19;
//age = "19"
const isTrainer: boolean = true;

function concatName(fname:string, lname:string): string{
    const fullName  = fname + " " + lname; // most of the time TS will infer the type of a variable. so you do not have to explicitly state it
    // and it will still be type safe
    return fullName;
}

function add(num1:number, num2:number): number{
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

//any supports any value assigned to it
let something: any = "";
something = 9
something = false;