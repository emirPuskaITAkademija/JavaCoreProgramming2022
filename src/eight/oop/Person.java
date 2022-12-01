package eight.oop;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private final LocalDate birthday;


    public Person(LocalDate birthday){
        this.birthday = birthday;
    }

//    public void setBirthday(LocalDate birthday){
//        this.birthday = birthday;
//    }

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

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int age = period.getYears();
        return age;
    }

    public static Person fromBirthday(LocalDate birthday){
        return new Person(birthday);
    }
}
