package three;

import java.util.Scanner;

//   && -> USLOVNI AND
//   || -> USLOVNI OR
public class ConditionalDemo1 {

    public static void main(String[] args) {
        System.out.println("Unesi starost: ");
        int starost = new Scanner(System.in).nextInt();
        System.out.println("Unesi prosjek ocjena: ");
        double prosjekOcjena = new Scanner(System.in).nextDouble();
        if(starost>=18 && prosjekOcjena>=3.5){
            System.out.println("Ispunili uslov za upis na fakultet");
        }
        if(starost>=18 || prosjekOcjena >=2){
            System.out.println("Možete se vjenčati");
        }
    }
}
