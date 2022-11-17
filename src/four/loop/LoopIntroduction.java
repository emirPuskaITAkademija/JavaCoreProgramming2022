package four.loop;

import java.util.Scanner;

public class LoopIntroduction {
    public static void main(String[] args) {


        while (true){
            System.out.println("Hej reci mi kako si ? ");
            String odgovor  = new Scanner(System.in).nextLine();
            System.out.println("Odgovor: " +  odgovor);
        }


    }
}
