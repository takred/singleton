package takred.item;

public class Armor implements Item {
    private final int price;
    private final String name;

    public Armor(int price, String name) {
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
