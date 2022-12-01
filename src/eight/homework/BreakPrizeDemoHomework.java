package eight.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Dva parametra su postavka:
 * <li>1. magicniBrojevi</li>
 * <li>2. nagrada koja se umanjuje sa svakim pogrešnim unosom i to za 10 %</li>
 * <p>
 * Zadaća 2: -> OBRATI pažnju na dio koji se tiče magičnih brojeva
 * Korisnik unosi ne jedan nego niz od 8 brojeva i program provjerava da li je bar jedan od
 * 8 brojeva unutar niza magicniBrojevi.
 * <p>
 * Nagrada se i dalje umanjuje shodno broju pokušaja ali se sada umanjuje za 30 %
 * jer je vjerovatnoća pogodka uvećana.
 * Korisnik treba da ima mogućnost unosa sve dok je nagrada veća od nule.
 * </p>
 * </p>
 */
public class BreakPrizeDemoHomework {
    public static void main(String[] args) {
        /**
         * DORADA ZADATKA: Program treba(a ne korisnik) da GENERIŠE svih 8 brojeva i da je na svako pokretanje
         * niz zvani "magicniBrojevi" popunjen drugim vrijednostima tačnije generisanim vrijednostima.
         * <HINT> Koristi klasu Random koja će generisati brojeve u poljima niza</HINT>
         * Random random = new Random();
         *
         * int slucajnuVrijednost = random.nextInt(10000);
         */
//        Random random = new Random();
//        int slucajanBroj = random.nextInt(10000);
//        System.out.println(slucajanBroj);
//        int[] magicniBrojevi = new int[8];
        int[] magicniBrojevi = {234, 1000, 19999999, 23455, 987, 999, 44, 32};

        double nagradniFond = 10000;
        double stepenUmanjenja = 0.33 * 10000;
        int[] uneseniBrojevi = new int[5];
        OMEGA:
        while (nagradniFond > 0) {
            /**
             * Petlja ispod ima svrhu skladištenja unesenih brojeva u niz.
             */
            for (int i = 0; i < uneseniBrojevi.length; i++) {
                int count = i + 1;//pomocna varijabla
                System.out.println("Unesite " + count + ". broj: ");
                uneseniBrojevi[i] = new Scanner(System.in).nextInt();
            }
            /*
                Petlja ispod treba da analizira unesene brojeve i da ih uporedi sa magičnim brojevima.
             */
            for (int k = 0; k < uneseniBrojevi.length; k++) {
                int temp = uneseniBrojevi[k];
                for (int j = 0; j < magicniBrojevi.length; j++) {
                    if (magicniBrojevi[j] == temp) {
                        System.out.println("Unijeli ste tačan broj " + temp + ". Čestitamo, dobili ste nagradu u iznosu " + nagradniFond + " $");
                        break OMEGA;
                    }
                }
            }
            System.out.println("Unijeli ste pogrešne brojeve. Pokušajte ponovno.");
            nagradniFond = nagradniFond - stepenUmanjenja;
        }
    }
}
