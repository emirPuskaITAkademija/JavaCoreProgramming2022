package four.flow;

import java.util.Scanner;

public class SwitchDemoYield {
    public static void main(String[] args) {
        System.out.println("Unesite godinu:");
        int godina = new Scanner(System.in).nextInt();
        System.out.println("Unesite mjesec u godini:");
        int mjesec = new Scanner(System.in).nextInt();
        int brojDanaMjeseca = switch (mjesec) {
            case 1:
                yield 31;
            case 3:
                yield 31;
            case 5:
                yield 31;
            case 7:
                yield 31;
            case 4:
                yield 30;
            case 6:
                yield 30;
            case 2: {
                //prestupna godina => godina djeljiva sa 4 a nedjeljiva sa 100 ILI   godina djeljiva sa 400
                if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default:  yield  -1;
        };
        System.out.println("Broj dana u mjesecu: " + brojDanaMjeseca);
    }
}
