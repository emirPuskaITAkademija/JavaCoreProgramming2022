package five.loops;

/***
 * <li>pocetni uslov poetlje   i = 0</li>
 * <li>uslov petlje     i < 10  </li>
 * <li>korak petlje i++   </li>
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Necemo na pauzu...Hocemo kuci..");
            i++;
        } while (i < 10);
    }
}
