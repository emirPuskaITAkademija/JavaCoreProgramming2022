package three;

/**
 * 1. String
 * 2. NIZ
 */
public class ObjectTypeDemo {
    public static void main(String[] args) {
        int number = 23;
        number = 34;
        System.out.println(number);
        //NIZ
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 34;
        System.out.println("Indeks 0 čuva vrijednost: " + numbers[0]);
        //String
        String name = new String("Dejla"); // -> poziv konstruktora
        String name2 = "Dejla"; // -> String literal
        String name3 = "Dejla";
        System.out.println(name2 == name); // FALSE
        System.out.println(name3 == name2); //TRUE
        System.out.println(name3 == name); //FALSE
        System.out.println();
        System.out.println(name2.equals(name));//TRUE
        System.out.println(name3.equals(name2));//TRUE
        System.out.println(name3.equals(name));//TRUE
    }
}
