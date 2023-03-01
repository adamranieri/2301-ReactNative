package Wednesday.CollectionsExample.QueueExample;

import java.util.Comparator;

// implementing the comparator class means that this class is going
// to be responsible for comparing another class
public class RatingCompare implements Comparator<Movie> {

    // because we aren't actually comparing an instance of this class
    // we don't use the "this" keyword and we just take in 2 movie objects
    @Override
    public int compare(Movie o1, Movie o2) {
        // explicitly say whether we return 1, -1, 0 for each scenario:
        if (o1.getRating() > o2.getRating()) return 1;
        else if(o1.getRating() < o2.getRating()) return -1;
        else return 0;
    }
}
