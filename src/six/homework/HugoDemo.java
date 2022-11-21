package six.homework;

import java.util.Scanner;

public class HugoDemo {
    public static void main(String[] args) {

        System.out.println("Unesi peticu i započni igricu");

        while (true) {
            int number = new Scanner(System.in).nextInt();
            if (number == 5) {
                System.out.println("Unio si peticu i počeo si igricu");
                break;
            } else {
                //TODO: ne gledati ovo rješenje i ExampleLoop nego ponuditi svoje rješenje
            }
        }
    }
}
