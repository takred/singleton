package takred.store;

import takred.item.Item;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private final Map<String, Item> shop = new HashMap<String, Item>();

    public Integer getPriceByName(String name) {
        return this.shop.get(name).getPrice();
    }

    public void addProduct(String name, Item item) {
        shop.put(name, item);
    }
}
