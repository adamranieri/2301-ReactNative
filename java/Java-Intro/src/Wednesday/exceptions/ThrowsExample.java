package Wednesday.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
    public static void main(String[] args) throws FileNotFoundException{
        // alt + enter gives us quick fixes:
        // because helper throws FileNotFoundException, we have to include it in this declaration:
        helper();
        // because we catch the exception in helper2, is itsn't propogated to this method call
        helper2();
    }

    // if we make this helper throw an exception, that is propogated to where the
    // method is being called from
    public static void helper() throws FileNotFoundException{
        FileReader file = new FileReader("test.txt");
    }

    public static void helper2(){
        try {
            Class.forName("invalid class");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
            System.out.println("This is after stack trace");
        }
    }
}
