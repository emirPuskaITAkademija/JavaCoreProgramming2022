package seven.oop;

public class DogDemo {
    public static void main(String[] args) {
        System.out.println(Dog.counter);//0

        Dog rex = new Dog("Rex", 50);
        System.out.println(rex.counter); //1
        Dog cicko = new Dog("Cicko", 13);
        System.out.println(rex.counter); //2
        System.out.println(cicko.counter);//2
        Dog lesi = new Dog("Lesi", 23);
        System.out.println(rex.counter); //3
        System.out.println(cicko.counter);//3
        System.out.println(lesi.counter); //3

        System.out.println(rex.getName());
        System.out.println(cicko.getName());

    }
}
