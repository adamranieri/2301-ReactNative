package Monday.FlowControl;

// java.util is a package that has a lot of useful classes like Scanner, Date, etc.
import java.util.Scanner;

public class FlowControlExample {
    public static void main(String[] args) {
        boolean loggedIn = false;
        // if statements:
        if(loggedIn) {
            System.out.println("Welcome");
        }
        else if (!loggedIn) {
            System.out.println("You must log in");
        }
        else {
            System.out.println("This statement would never get executed");
        }

        // for loops:
        for(int i = 0; i < 10; i ++) {
            System.out.println(i);
        }

        // while loop:
        int i = 0;
        while(i < 20) {
            System.out.println(i);
            // incrementing by 2:
            i += 2;
        }

        // write a while loop to check if a password is greater than or equal to 8 characters
        // Declare a scanner using the constructor. This particular constructor takes in a stream of where we
        // want our data to come from (System.in is our command line)
        Scanner passwordInput = new Scanner(System.in);
        String password = "";
        // do while loop
        do {
            // read in a password from the console:
            System.out.print("Enter password => ");
            password = passwordInput.nextLine();
            // print out an empty line to move to the next line:
            System.out.println();
        }
        // keep looping until we have a password that's 8 or longer
        while(password.length() < 8);

        System.out.println("Your password is " + password);


        switch(password) {
            case "password":
                System.out.println("That is a bad password");
                // make sure to include break statements. Otherwise, we will "trickle down" into the other cases:
                break;
            case "password123":
                System.out.println("This is also a bad password");
                break;
            default:
                System.out.println("This might be a good password. But this switch statement isn't complex enough to tell");
                break;
        }

        // Menu navigation is one use case for scanners:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to Login");
        System.out.println("Press 2 to Register");
        System.out.println("Press 3 to View Profile");


        // Sometimes, if we want to scan for different data types, we might want to use different scanners:
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Logging in");
                break;
            case 2:
                System.out.println("Registering now");
                break;
            case 3:
                System.out.println("Profile Details");
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }




    }
}
