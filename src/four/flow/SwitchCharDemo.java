package four.flow;

public class SwitchCharDemo {
    public static void main(String[] args) {
        char ocjena = 'A';

        //u switch (    )   -> može ići int ili nešto što je konvetibilno u integer
        int ocjenaBrojevno = switch (ocjena) {
            case 'A' -> {
                yield 10;
            }
            case 'B' -> {
                yield 9;
            }
            default -> {
                yield 6;
            }
        };

        System.out.println("Ocjena je : " + ocjenaBrojevno);
    }
}
