package nine.inheritance;

public enum Gender {
    MALE("Muški", "Grublji spol"),//Gender MALE = new Gender("Muški")
    FEMALE("Ženski", "Ljepši spol"),
    UNKNOWN("Nešto između", "Ne zna se..");


    private String name;
    private String description;

    private Gender(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
