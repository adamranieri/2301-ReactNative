package Wednesday.CollectionsExample.ListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // we declare the list using the interface list but we use the ArrayList constructor because
        // ArrayList is an implementation of the List interface
        // pass in the type that we want to store in the <>:
        List<String> names = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

        // add individual element:
        names.add("Rory");
        names.add("Rory");
        names.add("Rory");
        names.add("Maha");
        names.add("Angel");
        names.add("Erich");
        names.add("Brian");
        names.add(2, "Jeremy");

        // add all elements from a given collection to another collection:
        names2.addAll(names);

        // clear out a collction:
        names.clear();

        System.out.println(names);
        System.out.println(names2);
        System.out.println(names2.get(4));
        System.out.println();

        for(int i = 0; i < names2.size(); i ++) {
            System.out.println(names2.get(i));
        }

        System.out.println();

        for(String name: names2) {
            System.out.println(name);
        }

        System.out.println();

        // .iterator returns an iterator that points to the list:
        Iterator<String> iterator = names2.iterator();
        // .hasNext tells us if there is another element that the iterator points to:
        while(iterator.hasNext()){
            // .next advances the iterator and returns that next value:
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
