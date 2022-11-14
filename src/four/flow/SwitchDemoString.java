package four.flow;

import java.util.Scanner;

/**
 * switch prima kao input dakle ono što je u "malim zagradam" int ili
 * nešto što je konvertibilno u int.
 *
 * <p>
 * Od verzije Jave 7 u switch može ići u "male zagrade" i String vrijednost ili
 * String varijabla.
 * </p>
 */
public class SwitchDemoString {
    public static void main(String[] args) {
        System.out.println("Unesite ime dana:");
        String imeDanaNaNjemackom = new Scanner(System.in).nextLine();
        int redniBrojDana = switch (imeDanaNaNjemackom) {
            case "Montag" -> {
                yield 1;
            }
            case "Dienstag" -> {
                yield 2;
            }
            case "Mittwoch" -> {
                yield 3;
            }
            case "Donnerstag" -> {
                yield 4;
            }
            case "Freitag" -> {
                yield 5;
            }
            case "Samstag" -> {
                yield 6;
            }
            case "Sonntag" -> {
                yield 7;
            }
            default -> {
                yield -1;
            }
        };
        System.out.println(imeDanaNaNjemackom + " je po redu " + redniBrojDana + ". u sedmici");
    }
}
