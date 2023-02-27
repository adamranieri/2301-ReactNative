package Monday.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Main class of the animal example");
        // calling the Animal constructor
        // constructor is a special method that is the creation of the object
        Animal animal = new Animal("Dog", "Clifford", 10, 4);
        Animal animal2 = new Animal("Fish", "Nemo", 10, 0);
        Animal animal3 = new Animal("Cat", "Garfield", 10, 4);
        Animal animal4 = new Animal("Turtle", "Franklin", 10, 2);
//        animal.age = 10;
//        animal.name = "Clifford";
//        animal.species = "dog";
//        animal.legs = 4;

        System.out.println(animal.name + " is a " + animal.species + " and has " + animal.legs + " legs.");

        // if we still want this to work, we need to give a no-args constructor:
        Animal animal1 = new Animal();

        animal.greet();
        animal2.greet();
        animal3.greet();
        animal4.greet();

        String animal4Greeting = animal4.greetingString();
        System.out.println(animal4Greeting);

        // Before we even write the toString method, we can use it because we are inheriting it from the Object class:
        System.out.println(animal.toString());

        // Note that these objects have the exact same parameters/fields:
        Animal scooby1 = new Animal("dog", "Scooby Doo", 10, 4);
        Animal scooby2 = new Animal("dog", "Scooby Doo", 10, 4);
        Animal scooby3 = new Animal("cat", "Scooby Doos", 11, 2);

        // Before we override the equals method, it's going to compare the memory reference
        // which will be different for 2 different objects even if they have the same exact properties
        System.out.println("scooby1.equals(scooby2): " + scooby1.equals(scooby2));
        System.out.println("Scooby 1 to self: " + scooby1.equals(scooby1));

        System.out.println(scooby1.hashCode());
        System.out.println(scooby2.hashCode());
        // different properties so we product a different hash code:
        System.out.println(scooby3.hashCode());



    }
}
