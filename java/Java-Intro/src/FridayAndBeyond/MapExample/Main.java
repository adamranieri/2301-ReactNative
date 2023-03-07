package FridayAndBeyond.MapExample;

import java.util.HashMap;
import java.util.Map;

/*
Tokyo (Population: 37,435,191)
Delhi (Population: 29,399,141)
Shanghai (Population: 26,317,104)
Sao Paulo (Population: 21,846,507)
Mexico City (Population: 21,671,908)
Cairo (Population: 20,484,965)
 */
public class Main {


    public static void main(String[] args) {
        // create a map object that maps strings to integers
        Map<String, Integer> populations = new HashMap<>();
        populations.put("Tokyo", 37);
        populations.put("Delhi", 29);
        populations.put("Shanghai", 22);
        populations.put("Sao Paulo", 22);
        populations.put("Mexico City", 21);
        populations.put("Cairo", 20);
        // this overwrites the original Tokyo value:
        populations.put("Tokyo", 38);

        System.out.println(populations);

        // get a specific value, based on key
        // we see why it's important that the keys are unique:
        System.out.println(populations.get("Delhi"));

        System.out.println(populations.keySet());
        System.out.println(populations.values());

        // forEach takes in a Biconsumer which takes 2 parameters (key, value)
        populations.forEach( (key, value) -> {
            System.out.println(key + " has a population of " + value);
        });

        populations.clear();

        System.out.println("Tokyo".hashCode());


    }
}
