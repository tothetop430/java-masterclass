package learning;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantity;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0.0) this.price = price;
    }

    public void adjustQuantity(int quantity) {
        int adjustedQuantity = this.quantity + quantity;
        if (adjustedQuantity >= 0) this.quantity = adjustedQuantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (obj.getClass() != this.getClass())) return false;
        return this.getName().equals(((StockItem) obj).getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + 42;
    }

    @Override
    public int compareTo(StockItem obj) {
        if (this == obj) return 0;
        if (obj != null) return this.getName().compareTo(obj.getName());
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "Stock Item Name: " + this.name +
                " Stock Item Qty: " + this.quantity +
                " Stock Item Price: " + this.price;
    }
}
