package Thursday.Java8Examples.FI;

// import everything from that package:
import java.util.Random;
import java.util.function.*;

// Look at some built in Functional Interfaces
public class Main2 {
    public static void main(String[] args) {
        // Consumers take in a single value and do something
        Consumer<String> printABunch = (value) -> {
            for(int i = 0; i < 10; i ++) {
                System.out.println(value);
            }
        };

        printABunch.accept("Hello World");

        // Predicate take in a value and return a boolean:
        Predicate<Integer> isEven = (value) -> (value % 2 == 0);
        BiPredicate<Integer, Integer> isDivisible = (val1, val2) -> (val1 % val2 == 0);

        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));

        System.out.println(isDivisible.test(6, 3));
        System.out.println(isDivisible.test(7, 2));

        // Function
        Function <String, String> greet = (name) -> "Hello " + name;

        System.out.println(greet.apply("Rory"));

        // Supplier
        Supplier<Integer> getRandom = () -> {
            Random generator = new Random();
            // nextInt returns a random number between 0 and N - 1 (99)
            return generator.nextInt(100);
        };

        // invoke the supplier 10 times, to get 10 different numbers:
        for(int i = 0; i < 10; i ++) System.out.println(getRandom.get());

    }
}
