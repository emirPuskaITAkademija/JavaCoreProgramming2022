package nine.inheritance.animal;
//apstraktna klasa: polja, konstruktor, funkcije
// i jednu dodatnu stvar zvanu apstraktna funkcija

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void playSound();
}
