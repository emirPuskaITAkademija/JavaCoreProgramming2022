package nine.inheritance.animal;

public class Dog extends Animal implements Runnable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("AW AW AW AW");
    }

    @Override
    public void run() {
        System.out.println("Dog is running...");
    }
}
