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

        Basket myBasket = new Basket("First");
        sellItem(myBasket, "water", 3);
        System.out.println(myBasket);
        sellItem(myBasket, "water", 100);
        System.out.println(myBasket);
        sellItem(myBasket, "water", 100);     // to się nie wykona, bo na stanie jest za mało sztuk
        System.out.println(myBasket);

        System.out.println();
        sellItem(myBasket, "chocolate", 10);
        sellItem(myBasket, "broccoli", 7);   // nie ma takiego artykułu w sklepie
        sellItem(myBasket, "bread", 2);
        sellItem(myBasket, "tomatoes", 3);
        System.out.println(myBasket);

        System.out.println(stockList);
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
