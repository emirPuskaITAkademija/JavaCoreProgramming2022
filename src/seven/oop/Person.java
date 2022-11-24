package seven.oop;

/**
 *
 * Klasa može biti:
 * <li>1. OUTER klasa -> ima isti naziv kao i fajl koji predstavlja</li>
 *     Samo dva modifikatora vidljivosti može imati OUTER Klasa.
 *     <li>1.1 public</li>
 *     <li>1.2 paketno privatni -> bez ključne riječi</li>
 * <li>2. INNER</li>
 *
 * Modifikatore vidljivosti:
 * <li>1. public -> javno dostupna klasa svima</li>
 * <li>2. protected -> naslijeđivanje</li>
 * <li>3. paketno privatni pristup -> bez ključne riječi</li>
 * <li>4. private</li>
 *
 * Klasa može imati:
 * <li> 1. POLJA -> name, surname, age</li>
 *
 */
public class Person{
    private String name;
    private String surname;
    private int age;

    public Person(String surname){
        this.surname = surname;
    }


    public Person(int age){
        this.age = age;
    }

    //prepisao defaultno ponasanje klase
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
