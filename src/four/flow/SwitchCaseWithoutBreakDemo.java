package four.flow;

import java.util.Scanner;

/**
 * SWITCH konstrukciju koristimo.
 * <li>
 * Program pita korisnika da unese redni broj dana u sedmici.
 * <li>Ukoliko je korisnik unio broj 1 ispisat će mu sve dane u sedmici.
 * <li>Ukoliko je korisnik unio broj 3 ispisat će mu Mittwoch i preostale dane u sedmici,
 * a izostavit će mu dane Montag i Dienstag.
 */
public class SwitchCaseWithoutBreakDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici:");
        int redniBrojDana = new Scanner(System.in).nextInt();
        String daniTekstualno = "";
        //switch-case-break
        switch (redniBrojDana) {
            case 1:
                daniTekstualno = "Montag,";
            case 2:
                daniTekstualno = daniTekstualno + " Dienstag,";
            case 3:
                daniTekstualno = daniTekstualno + " Mitwoch,";
            case 4:
                daniTekstualno = daniTekstualno + " Donnerstag,";
            case 5:
                daniTekstualno = daniTekstualno + " Freitag,";
            case 6:
                daniTekstualno = daniTekstualno +  " Samstag,";
            case 7:
                daniTekstualno = daniTekstualno + " Sonntag";
                break;
            default:
                daniTekstualno = "Neodgovorajući redni broj dana u sedmici.";
        }
        System.out.println(daniTekstualno);
    }
}
