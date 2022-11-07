package two;

/**
 * Konverzija jednog tipa varijable u drugi:
 *  1. AUTOMATSKA
 *     1.1 tipovi su međusobno kompatibilni
 *     1.2 odredišni tip veći od polaznog
 *  2. EKSPLICITNA
 */
public class QuestionExecutor {
    public static void main(String[] args) {
        //64 decimal number
        double doubleNumber = 23999.0;
        //32 int number
        int number = (int)doubleNumber;


        //32 decimal number
        float floatingNumber = 23.0f;
        //64 bit double decimal number
        double doubleNumber2 = floatingNumber;
    }
}
