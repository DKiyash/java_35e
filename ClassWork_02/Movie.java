package java_35e_HW.ClassWork_02;

public class Movie implements Comparable<Movie>{
    private int rating;
    private String name;
    private int year;

    public Movie(int rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    public String toString(){
        return "\nRating: " + rating + "; " +
                "Name: " + name + "; " +
                "Year: " + year;
    }
}
