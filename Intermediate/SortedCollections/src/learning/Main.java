package learning;

public class Main {

    private static final StockList stockList = new StockList();
    private static final Basket basket = new Basket();
    public static void main(String[] args) {
        StockItem temp = new StockItem("item1", 1, 2);
        stockList.addStock(temp);
        basket.addToBasket(temp, 2);

        temp = new StockItem("item2", 2, 3);
        stockList.addStock(temp);

        temp = new StockItem("item3", 3, 4);
        stockList.addStock(temp);
        basket.addToBasket(temp, 2);

        temp = new StockItem("item4", 4, 5);
        stockList.addStock(temp);

        temp = new StockItem("item5", 5, 6);
        stockList.addStock(temp);
        basket.addToBasket(temp, 2);

        temp = new StockItem("item6", 6, 7);
        stockList.addStock(temp);

        temp = new StockItem("item7", 7, 8);
        stockList.addStock(temp);
        basket.addToBasket(temp, 2);

        System.out.println(stockList);
        System.out.println("#####################\n");
        System.out.println(basket);

        System.out.println(stockList.getItems());
    }
}
