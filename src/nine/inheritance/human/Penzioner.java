package nine.inheritance.human;

public class Penzioner extends Person {

    private double pensionAmount;

    public Penzioner() {
        super();
    }

    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }
}
