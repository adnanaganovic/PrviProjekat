package seven;

public enum Season {                    //Koliko ima godišnjih doba = 4, onda se koristi enum, ali kod enuma konstruktor mora biti private
    WINTER("Zima"),
    SPRING ("Proljeće"),
    SUMMER("Ljeto"),
    AUTUMN ("Jesen");

    private String name;

    private Season(String name) {
            this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
