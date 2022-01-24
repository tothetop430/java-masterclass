package learning;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = this.list.getOrDefault(item.getName(), item);
            if (inStock != item) inStock.adjustQuantity(item.availableQty());
            this.list.put(inStock.getName(), inStock);
            return inStock.availableQty();
        }
        return 0;
    }

    public int sellStock(String itemName, int qty) {
        StockItem inStock = this.list.getOrDefault(itemName, null);
        if (inStock != null && qty > 0 && inStock.availableQty() >= qty) {
            inStock.adjustQuantity(-1 * qty);
            return qty;
        }
        return 0;
    }

    public StockItem get(String itemName) {
        return this.list.get(itemName);
    }

    public Map<String, StockItem> getItems() {
        return Collections.unmodifiableMap(this.list);
    }

    @Override
    public String toString() {
        String itemList = "";
        for (String itemName : this.list.keySet()) {
            itemList += this.list.get(itemName);
            itemList += "Total Price for " + itemName + " with " + this.list.get(itemName).availableQty() +
                    " qty. is " + (this.list.get(itemName).availableQty() *
                    this.list.get(itemName).getPrice()) + "\n";
        }
        return itemList;
    }

    public int removeStock(StockItem item) {
        if (item != null) {
            int qty = item.availableQty();
            this.list.remove(item.getName());
            return qty;
        }
        return 0;
    }
}
