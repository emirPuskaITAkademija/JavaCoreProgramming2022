package nine.inheritance;

import nine.inheritance.animal.*;
import nine.inheritance.human.Penzioner;
import nine.inheritance.human.Profesor;
import nine.inheritance.human.Student;

import java.time.LocalDate;

public class AnotherDemo {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom");

        Profesor profesor = new Profesor();
        profesor.setName("Remzija");
        profesor.setSurname("Remzić");
        profesor.setSalaryAmount(2000);
        profesor.setBirthday(LocalDate.of(1962, 12, 3));
        profesor.setAnimal(cat);

        Penzioner penzioner = new Penzioner();
        penzioner.setAnimal(new Hamster("Jerry"));


        Hamster hamster = new Hamster("Jerry");
        profesor.setAnimal(hamster);


        Student student = new Student();
        student.setName("ALden");
        student.setAnimal(hamster);

        student.setAnimal(new Fish("Zlatna"));
        student.setAnimal(new Hamster("Hrčak"));
        student.setAnimal(new Dog("Rex"));
        student.setAnimal(new Cat("Cicko"));
        student.setAnimal(new Rabbit("Brzi"));
    }
}
