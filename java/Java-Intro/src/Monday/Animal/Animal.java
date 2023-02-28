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
        // assign some default values:
        this.species = "";
        this.name = "";
        this.legs = 0;
        this.age = 0;
    }

    public void greet() {
        System.out.println("Hello, I am a " + this.species + " and my name is " + this.name);
    }

    public String greetingString() {
        return "Hello, I am a " + this.species + " and my name is " + this.name;
    }

    // Some "special" methods that are linked to the Object class
    // Overridinge: we change the implementation of a method that we got from a parent:
    public String toString() {
        String result = "";
        result += "{species: " + this.species + ", name: " + this.name + ", legs: " + this.legs + ", age: " + this.age + "}";
        return result;
    }

    // equals takes in an object to compare to and returns a boolean indicating whether it is equal to "this".
    public boolean equals(Object other) {
        // if these aren't even the same class, we return false;
        if(other.getClass() != Animal.class) return false;

        // we need to "cast" the other object to an Animal object so that we can access its properties
        // This specicially works in this case because Animal is a sub-class of Object
        Animal otherAnimal = (Animal) other;

        // can't cast between unrelated parent/children:
        // Animal stringAnimal = (Animal) "some_string";

        // Next step for comparing the equality:
        if(this.name != otherAnimal.name) return false;
        if(this.species != otherAnimal.species) return false;
        if(this.age != otherAnimal.age) return false;
        if(this.legs != otherAnimal.legs) return false;

        // if we've made it here without returning false, that means all the properties are equal and we can return true:
        return true;
    }

    // 1. Hash Code must be consistent: a hashcode for a given object should return the same value each time
    // 2. If 2 objects are equal (as defined by our .equals implementation, they should return the same hash code
    // 3. It it not necessarily the case that 2 unequal objects produce different hash codes
        // ex: 2 animals with different properties might both produce hash code 13. This wouldn't necessarily violate the rules
    // of a hash code but it could hinder performance

    public int hashCode() {
        // taking the hash code of the name field and returning it:
        // leveraging the fact that the String class has its own implementation of the hashCode method:
        // We don't need to hash the age and legs because they are already integers:
        return this.name.hashCode() + this.species.hashCode() + this.age + this.legs;
        // another option is to get the toString and get the hashCode
    }
    /*
    Sneak Preview of Collections:
    One of the main purposes of hash codes deals with collections
    Some collections use the process of hashing to organize our data
    ex: Pet1 = {Scooby Doo, dog} => 4
    ex: PEt2 = {Garfield, cat} => 3
    // The purpose of this hash code could be used an index for the data structure:
    // Having a consistent conversion to an integer is important to storing data in an array like that:
    [ null, null, null, Pet2, Pet1, null, null];
    // Let's say we want to get Scooby out of this array. Without hashing, we would have to loop through the entire arrau
    // until we reach Scooby
    // With the hash code, we have an constant-time (instantaneous) look up where the hash-code method immediately gives us our index
     */

}
