package learning;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final Map<StockItem, Integer> list;

    public Basket() {
        this.list = new HashMap<>();
    }

    public void addToBasket(StockItem item, int qty) {
        if (item != null && qty > 0) {
            int inBasket = this.list.getOrDefault(item, 0);
            this.list.put(item, inBasket + qty);
        }
    }

    @Override
    public String toString() {
        StringBuilder basketList = new StringBuilder();
        for (Map.Entry<StockItem, Integer> item: list.entrySet()) {
            basketList.append(item.getKey()).append(" purchasing -> ").append(item.getValue()).append("\n");
            basketList.append("Total Price: ").append(item.getKey().getPrice() * item.getValue()).append("\n");
        }
        return basketList.toString();
    }
}
