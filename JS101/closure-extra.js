

function createCounter(intial = 0){

    let value = intial;

    function increment(){
        value += 1;
        console.log(value);
    }

    return increment;

}

const counter1 = createCounter(100);
counter1();
counter1();
counter1();