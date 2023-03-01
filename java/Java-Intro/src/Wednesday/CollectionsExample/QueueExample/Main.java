package Wednesday.CollectionsExample.QueueExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
//import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // create a double-ended queue:
        Deque<String> names = new ArrayDeque<>();

        names.add("Mario");
        names.add("Luigi");
        names.add("Peach");
        names.add("Bowser");

        System.out.println(names);

        // peek looks at but doesn't remove the element:
        System.out.println(names.peek());
        // Poll for the head of the queue 4 times
        // First-In-First-Out (FIFO)
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        // try to poll an empty queue:
        System.out.println(names.poll());
        // peek will try to look at but not remove the head, return null because empty queue:
        System.out.println(names.peek());
        // remove will throw an exception if there is no element
//        System.out.println(names.remove());
//        System.out.println(names.element());


        // handling a null value:
        String name = names.poll();
        if(name == null) {
            System.out.println("No name found");
        }
        try {
            name = names.remove();
        } catch(NoSuchElementException e) {
            System.out.println("No name found");
        }

        // adding first and last:

        names.addFirst("Link");
        names.addFirst("Zelda");
        names.addFirst("Ganandorf");
        names.addLast("Sheik");
        names.addLast("Saria");
        names.addLast("Beedle");

        System.out.println(names);

        System.out.println(names.pollFirst());
        System.out.println(names.pollLast());
    }
}
