package Tuesday.thisExample;

public class Animal {
    private String sound;

    public Animal(String sound) {
        // To differentiate between instance field and parameter of the constructor
        this.sound = sound;
        // we can also use the "this" keyword to call a method from the current instance:
        this.speak();
    }

    public void speak() {
        System.out.println("Animal is saying: " + this.sound);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Meow");
        // calling speak from our instance:
        animal.speak();
    }
}
