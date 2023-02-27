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


    }
}
