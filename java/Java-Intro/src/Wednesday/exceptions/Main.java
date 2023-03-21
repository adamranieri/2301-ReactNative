package Wednesday.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Class Cast Exception:
//        Object x = new Integer(0);
//        System.out.println((String)x);

        int[] numbers = {1,2,3,4,5};
//        System.out.println("Pick an index from the array");
//        Scanner scanner = new Scanner(System.in);
//        int index = scanner.nextInt();
//        int chosenElement;
//        try {
//            // try to access index of array, but could potentially be out of bounds:
//            chosenElement = numbers[index];
//            // We can be specific about the exceptions we throw or general
//        } catch(IndexOutOfBoundsException exception) {
//            // it catches the exception and makes sure that the program doesn't ends and lets us retry:
//            System.out.println("Out of bounds, please pick a different number:");
//            index = scanner.nextInt();
//            chosenElement = numbers[index];
//        }

//        System.out.println("The chosen element is " + chosenElement);

        // Checked Exception:
        try {
            // because this constructor tries to create a file reader based on a file that might
            // not even exist, we have to handle the checked exception (FileNotFound) before we can run the program
            FileReader file = new FileReader("tst.txt");
            System.out.println("File found");
            System.out.println(numbers[100]);
        }
        catch(FileNotFoundException exception) {
            System.out.println("File doesn't exist :(");
        }
        catch(IndexOutOfBoundsException exception) {
            System.out.println("Index out of bounds");
        }
        finally {
            System.out.println("This code will happen whether or not we throw an exception");
        }

        try {
            System.out.println("This is some code in the try block");

        } finally{
            System.out.println("This is finally");
        }


    }
}
