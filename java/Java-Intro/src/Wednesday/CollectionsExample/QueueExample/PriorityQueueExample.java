package Wednesday.CollectionsExample.QueueExample;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> foods = new PriorityQueue<>();
        foods.add("cereal");
        foods.add("brocoli");
        foods.add("sandwich");
        foods.add("milkshake");
        foods.add("pasta");
        foods.add("grapes");
        foods.add("apples");

        // when we print out, we see it's not necessarily in alphabetical order
        System.out.println(foods);

        // when we poll them, they are in order
        // because the priority queue prioritizes the lower values first ("apple" is lower than "pasta") so apple will come out first
        while(!foods.isEmpty()) {
            System.out.println(foods.poll());
        }


        // compareTo method:
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));

        // movie example:
        // if we don't define an ordering for the movie object, this will throw an exception
        // we can define the ordering using the comparable class or the comparator
//        Queue<Movie> movies = new PriorityQueue<>();
        // if we want to use the ratings comparator to order these items, we pass it into the constructor:
        // if we don't pass in a comparator it will default to the comparable ordering:
        Queue<Movie> movies = new PriorityQueue<>(new RatingCompare());
        movies.add(new Movie("Star Wars", 1977, 8.5));
        movies.add(new Movie("Star Wars", 1980, 8.7));
        movies.add(new Movie("Interstellar", 2014, 10.0));
        movies.add(new Movie("The Whale", 2022, 7.8));
        movies.add(new Movie("Avatar:The Way of Water", 2022, 8.0));
        movies.add(new Movie("Spirited Away", 2002, 8.6));

        // How would we order these?
        // What order will these get polled from the queue?
        while(!movies.isEmpty()) {
            System.out.println(movies.poll());
        }

    }
}
