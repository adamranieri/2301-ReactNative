package Tuesday.OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate abstract class:
//        Animal animal = new Animal();

        Cow cow = new Cow();
        cow.speak();

        Cat cat = new Cat();
        cat.speak();

        cat.concreteMethod();
    }
}
