package Monday.Animal;

public class Animal {
    // defining the structure of an animal, they each have these fields/properties
    String species;
    String name;
    int age;
    int legs;

    // If we don't create a constructor for our class, Java will automatically create a default no-args constructor

    // make a constructor that takes in 4 parameters (species, name, age, legs):
    // all constructors have the exact same name as the class
    public Animal(String species, String name, int age, int legs) {
        // we want to take the parameters that we pass in to our constructor and assign them to the fields of the obejct
        // the "this" keyword refers to the current instance:
        this.species = species;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    // make our own no-args constructor:
    public Animal() {
        this.species = "";
        this.name = "";
        this.legs = 0;
        this.age = 0;
    }

}
