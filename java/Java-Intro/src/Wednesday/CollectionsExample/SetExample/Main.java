package Wednesday.CollectionsExample.SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Wrapper class: class representation of primitive types
        Set<Integer> ids = new HashSet<>();

        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        ids.add(6);
        ids.add(7);
        ids.add(8);
        ids.add(9);
        ids.add(10);
        ids.add(11);
        ids.add(12);
        ids.add(13);
        ids.add(8);

        System.out.println(ids);

        for(Integer id : ids) {
            System.out.println(id);
        }

        for(Iterator<Integer> iterator = ids.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        // with the tree set, the values are ordered
        Set<String> names = new TreeSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Saul");
        names.add("Skyler");
        names.add("Hank");
        System.out.println(names);

        Set<Integer> grades = new TreeSet<>();
        grades.add(100);
        grades.add(1);
        grades.add(12);
        grades.add(34);
        grades.add(23);
        grades.add(56);
        grades.add(40);
        System.out.println(grades);

        // We don't have to specify type OR we can specify Object to allow anything to be added:
        Set<Object> genericSet = new HashSet<>();
        genericSet.add("Hello");
        genericSet.add(3);
        System.out.println(genericSet);

    }
}
