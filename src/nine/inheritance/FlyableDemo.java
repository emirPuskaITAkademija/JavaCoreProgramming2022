package nine.inheritance;

public class FlyableDemo {
    //Depend upon abstraction not upon concrete implementation
    private Flyable flyable;

    public FlyableDemo(Flyable plane){
        this.flyable = plane;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void executeFlying(){
        flyable.fly();
    }
}
