// JS is a functional programming language but that does not mean objects do not exist
// Objects do not have to be created with a class.
// objects are just a collection of key value pairs
// 99% of all objects are created with the object literal syntax
const adam = {fname:"Adam", lname:"Ranieri", age:19, isTrainer: true};
console.log(adam);//
console.log(adam.fname);// Adam

adam.fname = "Frank"; // you can reassign the properites on an object at anytime
console.log(adam);

adam.mi = "C";// you can add a property at anytime
console.log(adam);

delete adam.isTrainer;// you can remove properties. You will almost never see this in actual code
console.log(adam)

// to access a property on an object you can the dot notation but you can also use bracket notation
console.log(adam["lname"]);// Ranieri The bracket syntax allows objects to be used as maps

const tebow = {
    fname: "Tim",
    lname: "Tebow",
    universityInfo:{
        name:"University of Florida",
        location: "Gainesville"
    }
}
console.log(tebow)
console.log(tebow.universityInfo.name)

// functions that are attached to objects are called methods
// functions on an object can use the this keyword to refer to properties on the object

const ryan = {
    fname:"Ryan",
    lname:"Schlientz",
    introduceSelf: function(){
        const greeting = "Hello my name is " + this.fname;
        console.log(greeting)
    }
}
ryan.introduceSelf();

function createPerson(fname, lname){
    return {
        fname:fname, 
        lname:lname,
        introduceSelf: function(){
            const greeting = "Hello my name is " + this.fname;
            console.log(greeting)
        }
    }
}

// Constructor functions are pretty rare 
function Person(fname, lname){
    this.fname = fname;
    this.lname = lname;
}
const hank = new Person("Hank","Smith");
