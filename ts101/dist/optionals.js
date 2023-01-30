function greet(name, num) {
    if (num) {
        for (let i = 0; i < num; i++) {
            console.log(name);
        }
    }
    else {
        console.log(name);
    }
}
greet("Adam", 4);
