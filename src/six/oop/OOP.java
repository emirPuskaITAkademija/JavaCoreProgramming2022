package six.oop;

/**
 * Dvije vrste tipova podataka:
 * <li>1. Primitivne ili proste</li>
 * <li>2. Objektni ili složeni</li>
 */
public class OOP {
    public static void main(String[] args) {
        int number = 23;
        number = 24;
        //polja niza indeksirana
        //OGRANIČENJE NIZA: svi elementi na indeksiranim poljima moraju biti istog
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 24;
        char[] slova = new char[3];
        slova[0] = 'A';
        slova[1] = 'a';
        slova[2] = 'a';

        //new ->
        Person person = new Person("Ivica");//mem1
        person.name = "Ivica";
        person.surname = "Stanić";
        person.age = 33;

        Person person2 = new Person("Meris"); // mem2
        person2.name = "Meris";
        person2.surname = "Bučan";
        person2.age = 23;

    }
}
