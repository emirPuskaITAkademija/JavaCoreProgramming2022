package three;

import javax.swing.*;
import java.util.Scanner;

//PROSTI TIPOVI

/**
 * int -> Integer
 * double -> Double
 *
 */
public class Question2Demo {
    public static void main(String[] args) {
        System.out.println("Unesi tekstualno cijeli broj");
        String text = JOptionPane.showInputDialog("Unesi broj");
        int number = Integer.parseInt(text);
        System.out.println(number);
    }
}
