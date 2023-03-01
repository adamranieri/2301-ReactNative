package Wednesday.CollectionsExample.QueueExample;

// we implement the Comparable class so we can compare these movies together:
public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;

    public Movie() {

    }

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    // in this method, we want to compare "this" with the other movie:
    public int compareTo(Movie other) {
        // leveraging the fact that strings already have a compareTo method built in
        int result;
        result = this.name.compareTo(other.getName());
        // if names are not the same, there's no tie, so we can return this:
        if(result != 0) {
            return result;
        }
        // otherwise, we can return the year comparison
        else {
            return this.year - other.getYear();
        }
    }
}
