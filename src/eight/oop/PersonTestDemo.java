package eight.oop;

import java.time.LocalDate;
import java.time.Month;

public class PersonTestDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1959, Month.SEPTEMBER, 12);
        Person person = new Person(birthday);
        person.setName("Mirsad");
        person.setSurname("Škandro");
        int age = person.getAge();
        System.out.println("Starost: "  + age);

        Student student = new Student(LocalDate.of(2000, 1, 1));
        student.getAge();
    }
}
