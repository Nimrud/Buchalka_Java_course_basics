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
        // dodanie tego samego przedmiotu:
        temp = new StockItem("chocolate", 2.99, 25);
        stockList.addStock(temp);

        System.out.println(stockList);

        System.out.println("=======");
        System.out.println("Items we've added:");
        for (String s : stockList.Items().keySet()){
            System.out.println(s);
        }
    }

    public static int sellItem(Basket basket, String item, int quantity){
        // getting item from stockList:
        StockItem stockItem = stockList.getItem(item);
        if (stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        // jeśli kod dotarł do tego miejsca, to znaczy, że nie mamy wystarczająco towaru do sprzedania:
        return 0;
    }
}
