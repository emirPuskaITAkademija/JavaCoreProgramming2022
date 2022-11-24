package seven.oop;

/**
 * Klasa može imati:
 * <li>1. polja</li>
 * <li>2. konstruktor</li>
 */
public class Movie {

    private String title;
    private String director;
    private int year;
    private double rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Movie movie = new Movie();
    //movie.setRate(11) ->
    //movie.setRate(8.5)
    public void setRate(double rate) { //18
        if(rate>10.0){
            this.rate = 10.00;
        }else if(rate<0){
            this.rate = 0.0;
        }else{
            this.rate = rate;
        }
    }

    public double getRate() {
        return rate;
    }

    /**
     * Funkcija - blok koda koji se izvršava kada se pozove.
     * <li>
     *     modifikator vidljivosti, POVRATNU VRIJEDNOST, ime funkcije , parametre 0 ili vise
     * </li>
     */


//    public void ocijeniFilm(double ocjena){
//        if(ocjena>10.0){
//            rate = 10.00;
//        }else if(ocjena<0){
//            rate = 0.0;
//        }else{
//            rate = ocjena;
//        }
//    }

//    public double dohvatiOcjenu(){
//        return rate;
//    }

}
