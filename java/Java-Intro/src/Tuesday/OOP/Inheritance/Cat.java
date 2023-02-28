package Tuesday.OOP.Inheritance;

public class Cat extends Mammal{
    private String breed;
    public Cat(String name, String breed) {
        // Because all cats chare some common traits, we can hard-code in a lot of values:
        super("cat", name, 4, "Meow");
        // also pass in this new field (breed):
        this.breed = breed;


    }

    @Override // annotation indicates that we are overriding a method:
    public void whichClass() {
        System.out.println("This is the cat class.");
    }

//    @Override
//    public void whichClass() {
//        System.out.println("Can't do this");
//    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
