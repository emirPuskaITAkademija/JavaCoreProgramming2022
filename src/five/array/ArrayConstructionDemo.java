package five.array;

/**
 * Prvi slozeni tip podatka:
 * <li>1. niz</li>
 */
public class ArrayConstructionDemo {
    public static void main(String[] args) {
        int number = 23;
        number = 34;
        number = 45;
        System.out.println(number);

        // cuvati sve ove brojeve iznad
        //DEKLARACIJA NIZA :   TIP i IME

        /**
         * 1. način
         * 1.1 alokacija ili zauzimanje prostora
         * 1.2 dodjela tom prostoru vrijednosti
         */
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 34;
        numbers[2] = 45;
        //numbers[3] = 123;
        for(int n: numbers){
            System.out.print(n + ",");
        }



    }
}
