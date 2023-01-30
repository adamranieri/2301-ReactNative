// Often we have functions that return or accept specific values
// we can specify specific literal return values
function bmiStatus(bmi) {
    if (bmi < 18.5) {
        return "Under Weight";
    }
    if (bmi < 24.9) {
        return "Healthy Weight";
    }
    return "Overweight";
}
const gary = bmiStatus(22);
// you can also specify object literal types on the spot if you do not want to create a whole type for something
function makeOlder(something) {
    something.age = something.age + 1;
}
const kim = { fname: "Kim", age: 20 };
const java = { age: 27, founder: "Sun Microsystems" };
makeOlder(kim);
makeOlder(java);
