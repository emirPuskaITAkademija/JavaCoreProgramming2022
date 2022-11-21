package six.branching;

import java.util.Scanner;

/**
 * Imamo niz brojeva u programu.
 * <p>
 * int[] numbers.....
 * <li></li>
 * Postavka zadatka:
 * Pustimo korisnika da unese neki broj i ako korisnik unese broj mi moramo
 * provjeriti da li je uneseni broj unutar niza brojeva iz programa.
 * <li>1. Ako jeste onda kažemo korisniku da je pogodio broj</li>
 * <li>2. Ako nije onda mu moramo ponovno omogućiti da unese broj sve dok ne unese broj koji je sadržan
 * u našem nizu brojeva</li>
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] magicniBrojevi = {234, 1000, 19999999, 23455, 987, 999, 44, 32};
        ELDAR: while (true) {
            System.out.println("Unesite broj i okušajte sreću: ");
            int uneseniBroj = new Scanner(System.in).nextInt();
            boolean pogodio = false;
            for (int i = 0; i < magicniBrojevi.length; i++) {
                if (uneseniBroj == magicniBrojevi[i]) {
                    System.out.println("Fkt si sretan i svaka čast");
                    pogodio = true;
                    break;
                }
            }
            if(pogodio){
                break;
            }
        }
    }
}
