package alpha;

/**
 * Created by ronald on 23/10/16.
 */
public enum Animal {
    FelisCatus("Furgus"), CanisLupis("Fido"), Mus("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
