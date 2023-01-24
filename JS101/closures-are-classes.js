
// closures were the origin of class in OOP languages

function createPerson(fname){

    let privateFname = fname;

    function setFname(newName = ""){
        if(newName.length >0){
            privateFname = newName;
        }else{
            console.log("New name must have at least one character")
        } 
    }

    function getName(){
        return privateFname;
    }

    return {
        getName:getName,
        setFname:setFname
    }
}

const ryan = createPerson("Ryan");

console.log(ryan.getName());
ryan.setFname("");
ryan.setFname("Howard");
console.log(ryan.getName());