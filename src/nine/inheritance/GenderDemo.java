package nine.inheritance;

public class GenderDemo {
    public static void main(String[] args) {
        Gender gender = Gender.MALE;
        System.out.println(gender.hashCode());
        Gender gender1 = Gender.MALE;
        System.out.println(gender1.hashCode());

        String name = "Kenan";
        String name1 = "Kenan";
        String name2 = new String("Kenan").intern();
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name2 == name1);
    }
}
