package takred.item;

public class Weapon implements Item{

    private final int price;
    private final String name;

    public Weapon(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
