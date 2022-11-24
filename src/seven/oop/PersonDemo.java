package seven.oop;

public class PersonDemo {
    public static void main(String[] args) {
        //odmah pri kreiranju ili konstruisanju objekta definirati obavezna polja objekta
        Person person = new Person("Steven", "Spielberg");
        person.setAge(56);

        Person person1 = new Person("Tarantino");

        Person person2 = new Person(23);


    }
}
