package nine.inheritance;

/**
 * Klasa može imati :
 * <li>1. polja</li>
 * <li>2. konstruktor/MORA</li>
 * <li>3. funkcije ili metode</li>
 *
 * <p>
 *     Apstraktna klasa može imati:
 *     <li>1. sve kao i konkretna klasa</li>
 *     <li>2. apstraktnut funkciju ili metodu</li>
 * </p>
 * <p>
 *     Interfejs:
 *     <li>1. može imati samo static polja</li>
 *     <li>2. ne može imat konstruktor</li>
 *     <li>3. Gotov svaka metoda potpisana u njemu je apstraktna</li>
 *     <li>3.1 Varijaciju na temu su uvele nove verzije Jave 1.8 +</li></li>
 * </p>
 */
public interface Flyable {

    void fly();

    default void method1(){

    }

     static void method2(){

    }
}
