package three;

import java.util.Scanner;

//prvi složeni String
public class StringDemo {
    public static void main(String[] args) {
        char slovo = 'A';
        String name = "Dejla";
        String surname = "Šarić";
        String fullName = name + " " + surname;
        System.out.println(fullName);
        //varijacija na temu
        int number = 23;
        char result = (char) (slovo + number); // A23
        System.out.println(result);
    }
}
