// Functions are objects just like anything else

function createPerson(fname, lname){

    const person = {
        fname: fname,
        lname: lname,
        introduceSelf: function(){
            console.log("Hello my name is " + this.fname + " " + this.lname)
        }
    }

    return person;

}

const adam = createPerson("Adam", "Ranieri");
adam.introduceSelf(); // fname on the adam object is "Adam". the function introduceSelf knows to use that fname

const rory = createPerson("Rory","Eiffe");
rory.introduceSelf(); // fname on the rory object is "Rory".

// Functions in JS ALWAYS maintain a refernce to any variable used within it

function showFullName(fname, lname){
    const fullName = fname + " " + lname;

    function printName(){ // you can create functions within functions
        console.log(fullName);// fullName is the enclosed value
    }

    return printName; // you can return functions because they are objects

}

// const printHank = showFullName("Hank", "Hill");
// printHank();

// const printPeggy = showFullName("Peggy","Hill");
// printPeggy();

function Car(){

    let mileage = 0;

    function driveCar(miles){ // functions are created dynamically. With the variables they point to dependent on when it was executed
        mileage += miles;
        console.log("The mileage is now "+mileage)
    }

    return driveCar;
}

// the two cars have 2 different functions that refer to differnt mileage variables
const subaru = Car();
subaru(100);
subaru(200);
subaru(500);

const honda = Car(); 
honda(10);
honda(45);
honda(7);
