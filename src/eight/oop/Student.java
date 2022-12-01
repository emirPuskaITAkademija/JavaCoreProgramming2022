package eight.oop;

import java.time.LocalDate;
import java.time.Period;

/***
 * DRY - Don't Repeat Yourself
 * <p>
 *     1. NASLIJEĐIVANJE ili INHERITANCE...
 * </p>
 */
//COPY/PASTE
public class Student extends Person{

//    private String name;
//    private String surname;
//    private final LocalDate birthday;
    private String indexNumber;

    public Student(LocalDate birthday){
        super(birthday);
        System.out.println("Student kreiran");
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }


}
