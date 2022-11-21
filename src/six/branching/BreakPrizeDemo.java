package six.branching;

import java.util.Scanner;

/**
 * Dva parametra su postavka:
 * <li>1. magicniBrojevi</li>
 * <li>2. nagrada koja se umanjuje sa svakim pogrešnim unosom i to za 10 %</li>
 */
public class BreakPrizeDemo {
    public static void main(String[] args) {
        int[] magicniBrojevi = {234, 1000, 19999999, 23455, 987, 999, 44, 32};
        double prize = 10000.0;
        double iznosUmanjenja = prize * 0.1;
        //10 %
        BERIN:
        while (prize > 0) {
            System.out.println("Unesi broj i okušaj sreću");
            int uneseniBroj = new Scanner(System.in).nextInt();
            //ENHANCED FOR LOOP
            for (int magicniBroj : magicniBrojevi) {
                if (uneseniBroj == magicniBroj) {
                    System.out.println("Čestimamo ! Osvojili ste nagradu od " + prize + " $");
                    break BERIN;
                }
            }
            prize = prize - iznosUmanjenja;
        }
    }
}
