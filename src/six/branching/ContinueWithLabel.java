package six.branching;

import java.util.Scanner;

/**
 * Parametri zadatka:
 * <li>1. rečenicu ne unosi korisnik nego je fiksno definiran u programu </li>
 * <li>2. riječ unosi korisnik</li>
 *
 * <p>
 * Zadatak:
 * Program provjerava karakter po karakter da li se unesena riječ sadrži u rečenici.
 * Ideja je da rečenicu i riječ konvertujemo u niz karaktera i dalje da radimo sa nizovima.
 * </p>
 * <p>
 *     ZADAĆA:
 *     Dovršiti primjer tako da korisniku na kraju bude ispisana jedna od dvije poruke:
 *     <li>1. Riječ je sadržana</li>
 *     <li>2. Riječ nije sadržana u rečenici</li>
 *     <p>
 *         NOVA ZADAĆA
 *         <li>1. Ispisati koliko se puta riječ ponavlja u rečenici</li>
 *         <li>2. Razmisliti da li treba ići do kraja rečenice odnosno do nizSlovaRecenice.length</li>
 *     </p>
 * </p>
 */
public class ContinueWithLabel {
    public static void main(String[] args) {
        String recenica = "Uskoro ćete dobiti novu zadaću u kojoj ćete provjeriti da li je unesena riječ palindrom";
        char[] nizSlovaRecenice = recenica.toCharArray();
        System.out.println("Unesite jednu riječ molim vas");
        String rijec = new Scanner(System.in).nextLine();
        char[] nizSlovaRijeci = rijec.toCharArray();
        boolean foundIt = false;
        //PROGRAM
        LABELA: for (int i = 0; i < nizSlovaRecenice.length; i++) {
            for (int j = 0; j < nizSlovaRijeci.length; j++) {
                char slovoIzRijeci = nizSlovaRijeci[j];
                char slovoIzRecenice = nizSlovaRecenice[i+j]; //TODO: razmisliti ??
                if(slovoIzRijeci != slovoIzRecenice){
                    continue LABELA;//ako se nikada ne izvrši ova linija to je znak da je riječ sadržana u rečenici
                }
            }
            foundIt = true;
            break;
        }
        //ternarni operator ?

        String message = foundIt ? "Riječ koju ste unijeli je sadržana u rečenici":"Riječ koju ste unije NIJE sadržana u rečenici";
//        if(foundIt){
//            message = "Riječ koju ste unijeli je sadržana u rečenici";
//        }else{
//            message = "Riječ koju ste unije NIJE sadržana u rečenici";
//        }
        System.out.println(message);
    }
}
