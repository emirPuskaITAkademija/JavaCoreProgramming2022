package eight;

public class MovieDemo {
    public static void main(String[] args) {


        Movie movie = new Movie("Spiderman");
        movie.setDirector("Stan Lee");
        movie.setRate(1000);
        movie.printMovieInfo();
        movie.printMovieInfo();
        movie.printMovieInfo();

        Movie movie1 = new Movie("Batman");
        movie1.setDirector("Matt Reeves");
        movie1.setRate(-10);
        movie1.printMovieInfo();


    }
}
