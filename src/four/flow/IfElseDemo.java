package four.flow;

import java.util.Scanner;

/**
 * Profesor treba da se fokusira na analizu vašeg ispita i procjenu
 * broja bodova.
 * Program treba na osnovu broja bodova da profi izbaci koju ocjenu
 * student zaslužuje.
 */
public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj bodova ostvarenih na ispitu:");
        int brojBodova = new Scanner(System.in).nextInt();
        char ocjena;
        if (brojBodova >= 90) {
            ocjena = 'A';
        } else if (brojBodova >= 80) {
            ocjena = 'B';
        } else if (brojBodova >= 70) {
            ocjena = 'C';
        } else {
            ocjena = 'D';
        }
        System.out.println("Ocjena : " + ocjena);
    }
}
