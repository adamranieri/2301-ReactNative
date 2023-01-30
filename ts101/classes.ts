
class Person{

    // you have access modifiers in TS
    private id: number 
    public fname: string 
    public lname: string 

    constructor(id: number, fname: string, lname:string){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

}

class Accountant extends Person{
}