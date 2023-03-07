package FridayAndBeyond.CustomExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OddException, EvenException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an even number:" );
        int x = scanner.nextInt();
        if(x % 2 != 0) {
            // our constructor that takes in a message
//            throw new OddException("Number can't be odd");
            // our no-args constructor:
            throw new OddException();
        }

        // throw an even exception
        throw new EvenException();

    }

}
