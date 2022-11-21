package five.loops;

import java.util.Arrays;
import java.util.Scanner;

/**
 * MRTVA petlja
 * <p>
 * ZADACA:
 * <p>
 * Postavka zadatka.
 * Kada korisnik uradi pogresan unos mi trebamo njegov pogresan unos skladistiti u nekoj varijabli.
 * Zatim trebamo korisniku prije nego mu kazemo da unese peticu ispisati njegov pogresan unos.
 * Format poruke:
 * <p>
 * "Unio si....{$brojeve} ...a petice niđe"..
 * </p>
 * {$brojeve} -> Dio koji trebate zamijeniti sa pogrenim unosom
 * <p>
 * Varijabla koja skladisti pogresan unos ne smije nikako biti prosta varijabla,
 * jer je potrebno korisniku ispisati sve njegove prethodne pogresne unose kako
 * bi konacno odlucio da pritisne peticu i da zapocne igricu.
 * </p>
 * </p>
 * </p>
 */
public class ExampleLoop {
    public static void main(String[] args) {
        //deklaracija potrebnih varijabli
        int velicinaNiza = 0;
        int[] pogresniUnosi = new int[velicinaNiza];
        while (true) {
            System.out.println("Unesi peticu i zapocni igricu..");
            int number = new Scanner(System.in).nextInt();
            if (number == 5) {
                System.out.println("Unio si peticu i poceo si igricu");
                break;
            } else {
                velicinaNiza++;
                pogresniUnosi = Arrays.copyOfRange(pogresniUnosi, 0, velicinaNiza);
                pogresniUnosi[velicinaNiza-1] = number;

                String porukaKorisniku = "Unio si ";
                for (int pogresanUnos : pogresniUnosi) {
                    porukaKorisniku = porukaKorisniku + pogresanUnos + ",";
                }
                porukaKorisniku= porukaKorisniku+" a petice niđe";
                System.out.println(porukaKorisniku);
            }
        }
    }
}
