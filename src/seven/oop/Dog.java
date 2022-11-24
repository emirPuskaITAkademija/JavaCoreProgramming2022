package seven.oop;

public class Dog {

    static int counter = 0;
    //nestatička polja
    private String name;
    private double weight;
    private int age;

    public Dog(String name, double weight){
        this.name = name;
        this.weight = weight;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printCounter(){
        System.out.println("Counter = " + counter);
    }

//    public static void incrementCounter(){
//        name = "dnksd";
//        counter++;
//    }
}
