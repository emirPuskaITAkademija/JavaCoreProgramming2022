package six.branching;

import java.util.Scanner;

/**
 * Postavka zadatka je rečenica.
 * <p>
 * Zadatak:
 * Pustiti korisnika aplikacije ili programa da unese slovo.
 * Nakon toga provjeriti da li se slovo sadrži u rečenici.
 * Ukoliko je zaista slovo sadržano u rečenici ispisati koliko se
 * puta ponavlja slovo u rečenici.
 * </p>
 */
public class ContinueDemo {
    public static void main(String[] args) {
        String recenica = "Petar Pan je pojeo crvenu papriku.";
        char[] nizSlovaIzRecenice = recenica.toCharArray();
        System.out.println("Unesi tačno jedno slovo");
        char unesenoSlovo = new Scanner(System.in).nextLine().charAt(0);
        int brojacPogodenogSlova = 0;

        for (char slovoIzNiza : nizSlovaIzRecenice) {
            if (unesenoSlovo != slovoIzNiza) {
                continue;
            }
            brojacPogodenogSlova++;
        }
        System.out.println("Uneseno slovo  " + unesenoSlovo + "  se u recenici javlja " + brojacPogodenogSlova + " puta");
    }
}
