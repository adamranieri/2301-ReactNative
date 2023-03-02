package Thursday.Java8Examples.Streams;

import Thursday.Java8Examples.FI.Raise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(23);
        numbers.add(56);
        numbers.add(12);
        numbers.add(36);

        // mapping them to the squares of the original number and then returning a list
        List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("Squares:" + squares);

        // filter and keep the evens and then sort:
        List<Integer> evens = numbers.stream().filter(x -> x % 2 == 0).sorted().toList();
        System.out.println("Even: " + evens);

        evens.stream().forEach(val -> {
            System.out.println("This is the forEach: " + val);
        });

        //                     start at 0, at each step, we add 1 to accumulated value:
        int numEven = evens.stream().reduce(0, (ans, current) -> ans + 1);
        System.out.println("Number of even numbers: " + numEven);


        int sumEven = evens.stream().reduce(0, (accumulator, current) -> accumulator + current);
        System.out.println("Sum of all even numbers:" + sumEven);

        int productEven = evens.stream().reduce(1, (accumulator, current) -> accumulator * current);
        System.out.println("Product of all even numbers:" + productEven);


        List<Integer> cubed = numbers.stream().map((x) -> x * x * x).collect(Collectors.toList());
        System.out.println(cubed);


    }
}
