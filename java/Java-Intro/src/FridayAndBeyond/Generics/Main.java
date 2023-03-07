package FridayAndBeyond.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person<Sword> knight = new Person("Link", new Sword(7, 10.0, "wood"));
        System.out.println(knight);

        Person<Potion> wizard = new Person("Harry", new Potion("Felix Felicis", "Liquid Luck"));
        // because we set up this object to take in a potion, we can't pass in a sword
//        wizard.setItem(new Sword(1, 2, "metal"));

        List<String> names = new ArrayList<>();
        // can't add an int to a list of strings:
//        names.add(12);

    }
}
