package eight.oop;

import java.time.LocalDate;
import java.time.Period;

public class Penzioner {
    private String name;
    private String surname;
    private final LocalDate birthday;
    private double pensionAmount;

    public Penzioner(LocalDate birthday){
        this.birthday = birthday;
    }

    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
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

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int age = period.getYears();
        return age;
    }
}
