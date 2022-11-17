package five.array;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Unesite broj.
 * Unesite broj
 * Unesite broj...
 * -> mi ubacimo u neki niz brojeva
 */
public class ArrayBasicExampleDemo {
    public static void main(String[] args) {
        int[] brojevi = new int[3];

        System.out.println("Unesite broj 1:");
        brojevi[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj 2:");
        brojevi[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj 3:");
        brojevi[2]= new Scanner(System.in).nextInt();

        for(int number: brojevi){
            System.out.println(number);
        }
    }
}
