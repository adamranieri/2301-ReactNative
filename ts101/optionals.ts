

function greet(name:string, num?:number){

    if(num){
        for(let i = 0; i <num; i++){
            console.log(name);
        }
    }else{
        console.log(name);
    }

}
greet("Adam", 4);

type Employee = {
    fname:string,
    lname:string,
    mi?:string
}

