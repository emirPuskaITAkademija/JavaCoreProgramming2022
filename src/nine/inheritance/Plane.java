package nine.inheritance;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Plane is flying..");
    }
}
