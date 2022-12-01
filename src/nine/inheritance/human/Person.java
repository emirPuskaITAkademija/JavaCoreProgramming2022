package nine.inheritance.human;

import nine.inheritance.animal.*;

import java.time.LocalDate;
import java.time.Period;

public class Person{
    private String name;
    private String surname;
    private LocalDate birthday;


    //Person je bio zavisan od Cat, Hamster, Fish, Bird... konkretne klase
//    private Cat cat;//MODIFICATION
//    private Hamster hamster;//MODIFICATION
//
//    private Fish fish;//MODIFICATION
//
//    private Bird bird;//MODIFICATION

    private Animal animal;

    public Person(){
       super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        //Mirsad je star: 20 godina 3 mjeseca i 4 dana
        int years = period.getYears();
        return years;
    }
}
