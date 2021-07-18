package demo;

public class UglyDuck extends Swan {
    private String name="wowowowo";

    public UglyDuck() {
        super();
        name = "UglyDuck";
    }

    public String fly() {
        return name.toUpperCase();
    }
}
