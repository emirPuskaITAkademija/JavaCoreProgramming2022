package seven.oop;

public class MovieDemo {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setDirector("Spielberg");
        movie1.setTitle("Indiana Jones");
        movie1.setYear(1984);
        movie1.setRate(8.5);
        double ocjena = movie1.getRate();
        System.out.println(ocjena); // 8.5

        Movie movie2 = new Movie();
        movie2.setDirector("Quentin Trantino");
        movie2.setTitle("Kill Bill");
        movie2.setYear(2015);
        movie2.setRate(12);
        System.out.println(movie2.getRate()); // 10.0

        movie2.hashCode();

    }
}
