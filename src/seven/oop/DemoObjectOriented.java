package seven.oop;

/**
 * Dvije vrste tipova podataka:
 * <li>1. Prosti ili primitivni</li>
 * <li>2. Složeni ili objektni</li>
 */
public class DemoObjectOriented {
    public static void main(String[] args) {
        int number = 23;
        number = 24;

        //NIZ brojeva -> svi elementi u nizu moraju biti ili tipa int ili tipa String ili tipa char
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 33;

        //Mi programeri moramo kreirati VLASTITI TIP PODATKA -> SLOŽENI/OBJEKTNI/INSTANCNI
//        Person safet = new Person();
//        safet.age = 23;
//        safet.name = "Safet";
//        safet.surname = "Karamujić";
//
//        System.out.println(safet.name);
//
//        Person slađana = new Person();
//        slađana.age = 13;
//        slađana.name = "Slađana";
//        slađana.surname = "Jokić";
//        System.out.println(slađana.surname);
    }
}
