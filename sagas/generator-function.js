
function hellos(){

    return "Hello 1";// as soon as the function encounters a return the value is returned and the function is terminated
    return "Hello 2";
    return "Hello 3";
}

function* holas(){
    console.log("Begin")

    yield "Hola 1";
    console.log("After Hola 1")

    yield "Hola 2";
    console.log("After Hola 2")

    yield "Hola 3";
    console.log("End")
}
// holas is a function that returns a generator not a typical function your just call.
const holaGenerator = holas();
const firstYield = holaGenerator.next()//the function will execute until it encounters a yield and then will stop executing
const secondYield = holaGenerator.next()// the function will resume where it left off in the code
const thirdYield = holaGenerator.next();
const eof = holaGenerator.next();

console.log(firstYield,secondYield,thirdYield, eof);
//Think of generator functions less as functions. And more like a script of code that you want to start and stop intermittently