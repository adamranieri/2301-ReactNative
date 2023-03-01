package Wednesday.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowThrows {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("tt.txt");
        } catch (FileNotFoundException e) {
            // literally saying we want to throw a runtime exception:
            throw new RuntimeException(e);
        }
    }
}
