package pl.jaczewski.m12_collections.sorted_collections;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 3.99, 200);
        stockList.addStock(temp);

        temp = new StockItem("water", 2.49, 200);
        stockList.addStock(temp);

        temp = new StockItem("tomatoes", 4.99, 20);
        stockList.addStock(temp);

        temp = new StockItem("chocolate", 3.29, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
    }
}
