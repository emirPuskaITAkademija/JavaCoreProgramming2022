package nine;

import nine.inheritance.animal.Animal;
import nine.inheritance.animal.Dog;
import nine.inheritance.human.Penzioner;
import nine.inheritance.human.Person;
import nine.inheritance.human.Profesor;
import nine.inheritance.human.Student;

import java.time.LocalDate;

//PATTERN programiranj: copy/paste WRONG POGREŠAN
// Princip: DRY Don't Repeat Yourself
public class NineDemo {
    public static void main(String[] args) {
        //Da li ima smisla kreirati ANIMAL ?
//        Animal animal = new Animal();
        int number = 23;
        int[] numbers = new int[3];
        Dog dog = new Dog("Rex");

        //Da li ima smisla kreirati PERSON ?
        Person person = new Person();
        person.setName("Mirsad");
        person.setSurname("Škandro");
        LocalDate birthday = LocalDate.of(1990, 1, 1);
        person.setBirthday(birthday);

        int age = person.getAge();
        System.out.println(person.getName() + " ima " + age + " godina");

        Penzioner penzioner = new Penzioner();
        penzioner.setName("Hamo");
        penzioner.setSurname("Hlapić");
        penzioner.setBirthday(LocalDate.of(1945, 1, 1));
        penzioner.setPensionAmount(2000);

        int penzionerAge = penzioner.getAge();
        System.out.println(penzioner.getName() + " ima " + penzionerAge + " godina");

        Student student = new Student();
        student.setName("Alden");
        student.setSurname("Efendić");
        student.setBirthday(LocalDate.of(2000, 1, 1));
        student.setIndexNumber("AE15055");

        int studentAge = student.getAge();
        System.out.println(student.getName() + " ima " + studentAge + " godina");


        Profesor profesor = new Profesor();
        profesor.setName("Stjepan");
        profesor.setSurname("Marić");
        profesor.setBirthday(LocalDate.of(1950, 12, 9));
        profesor.setSalaryAmount(3500);

        System.out.println(profesor.getName() + " ima " + profesor.getAge() + " godina");

    }
}
