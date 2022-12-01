package eight;

public class Movie {
    private String title;
    private String director;
    private int year;
    private double rate;


    public Movie(String title) {
        this.title = title;
    }

    public void setRate(double ocjena) {
        if (ocjena > 10) {
            rate = 10;
        } else if (ocjena < 0) {
            rate = 0;
        } else {
            rate = ocjena;
        }
    }

    public double getRate() {
        return rate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    //Preduvjet da se pozove ova funkcija
    public void printMovieInfo() {
        System.out.println("Director: " + director + ", Title: " + title+" , rating: " + rate);
    }
}
