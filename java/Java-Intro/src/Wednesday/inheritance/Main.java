package Wednesday.inheritance;

import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // declare the array using the parent class:
        Animal[] animals = new Animal[2];
        // so now, the array can accept any sub-type of Animal:
        animals[0] = new Cat();
        animals[1] = new Dog();

        for (Animal animal : animals) {
            animal.makeSound();
        }

        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a cat or a dog?");
        String choice = scanner.nextLine();
        switch(choice) {
            case "cat":
                animal = new Cat();
                break;
            case "dog":
                animal = new Dog();
                break;
            default:
                // we can throw an exception to indicate that something went wrong:
                throw new RuntimeException("Animal not valid");
        }
        animal.makeSound();

    }
}
