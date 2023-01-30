
const names: string[] = [];// this array only holds strings
names.push("Adam");
names.push("Rory");

// TS has two syntaxes for array generics
const temps: Array<number> = [10,30,42];


// promises are another place where you will often see generics

type Joke = {type:string, setup:string, punchline:string, id:number};

async function getRandomJoke():Promise<Joke>{
    const httpResponse = await fetch("https://official-joke-api.appspot.com/random_joke");
    const joke: Joke = await httpResponse.json();
    return joke;// asynchronous functions always return a promise
}

