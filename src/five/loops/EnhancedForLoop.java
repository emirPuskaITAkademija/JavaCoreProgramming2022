package five.loops;

/**
 * DRY -> Don't Repeat Yourself
 * <li>
 * OPEN/CLOSE
 * Open for extension close for modification
 * </li>
 */
public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] names = {"Alden", "Ivica", "Dejla", "Anja", "Eldar", "Eldar", "Meris", "Haris"};
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
//        System.out.println(names[5]);
//        System.out.println(names[7]);
//        System.out.println(names[8]);
//        System.out.println(names[9]);
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        //Java 1.7 ENHANCED for loop
        for(String name: names){
            System.out.println(name);
        }
    }
}
