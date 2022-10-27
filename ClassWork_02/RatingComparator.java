package java_35e_HW.ClassWork_02;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getRating() - o2.getRating();
    }
}
