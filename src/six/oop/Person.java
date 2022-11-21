package six.oop;

/**
 * public -> Modifikator vidljivost
 * <p>
 * U Java pr.jez. imamo 4 modifikatora vidljivosti:
 * <li>1. private </li>
 * <lI>2. package private</lI>
 * <li>3. protected</li>
 * <li>4. public </li>
 * </p>
 * <p>
 * Postoje razne klase:
 * <li> 1. OUTER</li>
 *    samo dva modifikatora vidljivosti
 *    <li>1.1 public</li>
 *    <li>1.2 paketno privatna </li>
 * <li>2. INNER</li>
 *
 * <p>
 *     Klasa može imati:
 *     <li>1. POLJA koja su imenovana za razliku od polja niza koja su indeksiran</li>
 *     <li>2. KONSTRUKTOR</li>
 *     <li>3. FUNKCIJE ILI METODE</li>
 *     <li>4. INNER klase</li>
 * </p>
 */
public class Person {
    public String name;
    public String surname;
    public int age;

    public Person(String ime){
        name = ime;
    }
}
