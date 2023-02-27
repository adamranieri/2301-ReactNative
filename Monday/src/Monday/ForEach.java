package Monday;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        // List and ArrayList are members of the Collections framework
        List<String> names = new ArrayList<>();
        names.add("Andrew");
        names.add("Andy");
        names.add("Maha");
        // forEach, is a Java 8 feature which use lambda expressions, similar to arrow functions in JS
        names.forEach(name -> {
            System.out.println("Hello, " + name);
        }
        );

        // simpler way of setting up the same thing:
        for(String name: names) {
            System.out.println("Hello, " + name);
        }
    }
}
