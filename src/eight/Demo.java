package eight;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];

        Random random = new Random();

        System.out.println(Person.counter);

        Person person1 = new Person("Zejd");
        person1.name = "Ivica";
        System.out.println(person1.age);

        Person person2 = new Person("Mirsad", "Škandro");



    }
}
