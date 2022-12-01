package eight;

/**
 * Klasa može imati 4 stvari:
 * <li>1. polja ili atribute ili properties</li>
 * <li>2. konstruktor - definise pravilo konstruisanja varijable kreirane po šablonu klase</li>
 * <li>3. funkcije ili metode</li>
 */
public class Person {
    public static int counter = 0;

    public String name;
    public String surname;
    public int age;

    public Person(String ime){
        name = ime;
    }

    public Person(int age){
        this.age = age;
    }

//    public Person(String prezime){
//        surname = prezime;
//    }

    public Person(String ime, String prezime){
        name = ime;
        surname = prezime;
    }
}
