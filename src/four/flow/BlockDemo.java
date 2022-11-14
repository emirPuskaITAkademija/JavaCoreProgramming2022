package four.flow;

import javax.swing.*;
import java.util.Scanner;

/**
 * Pustim korisnika da u konzoli unese broj godina.
 * Program provjerava punoljetnost korisnika konzumirajući njegov unos godina.
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesite vaš broj godina: ");
        int starostKorisnikaPrograma = new Scanner(System.in).nextInt();
        boolean uslovZaPunoljetnost = starostKorisnikaPrograma>=18;
        if (uslovZaPunoljetnost) {
            System.out.println("Vi ste punoljetni");
        }else{
            System.out.println("Niste punoljetni");
        }
    }
}
