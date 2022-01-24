package learning;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int qty) {
        if (item != null && qty > 0) {
            int inBasket = this.list.getOrDefault(item, 0);
            this.list.put(item, inBasket + qty);
            return inBasket + qty;
        }
        return 0;
    }

    public Map<StockItem, Integer> getItems() {
        return Collections.unmodifiableMap(this.list);
    }

    @Override
    public String toString() {
        String basketList = "";
        for (Map.Entry<StockItem, Integer> item: list.entrySet()) {
            basketList += item.getKey() + " purchasing -> " + item.getValue() + "\n";
            basketList += "Total Price: " + item.getKey().getPrice() * item.getValue() + "\n";
        }
        return basketList;
    }
}
