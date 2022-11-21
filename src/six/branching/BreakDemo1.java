package six.branching;

import java.util.Scanner;

public class BreakDemo1 {
    public static void main(String[] args) {
        int[] magicniBrojevi = {234, 1000, 19999999, 23455, 987, 999, 44, 32};
        IVICINA_FOR_PETLJA:
        for (; ; ) {
            System.out.println("Unesite broj i okušajte sreću: ");
            int uneseniBroj = new Scanner(System.in).nextInt();

            for (int i = 0; i < magicniBrojevi.length; i++) {
                if (uneseniBroj == magicniBrojevi[i]) {
                    System.out.println("Fkt si sretan i svaka čast");
                    break IVICINA_FOR_PETLJA;
                }
            }
        }
    }
}
