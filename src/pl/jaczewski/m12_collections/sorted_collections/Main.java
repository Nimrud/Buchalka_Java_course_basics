package pl.jaczewski.m12_collections.sorted_collections;

import java.util.Map;

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

        stockList.Items().get("water").adjustStock(6600);      // pierwszy sposób na modyfikację liczby egzemplarzy
        // sama Kolekcja [Items()] jest niemodyfikowalna, a nie poszczególne obiekty w niej!
        stockList.get("water").adjustStock(-1000);             // drugi sposób
        System.out.println(stockList);
        // niemodyfikowalna Mapa przedmiotów i cen, poszczególne obiekty w niej są niemodyfikowalne
        // (więc powyższy kod modyfikujący liczbę szt. tutaj by nie zadziałał)
        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
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
        System.out.println("There is not enough " + item + " in stock! Order not completed.");
        return 0;
    }
}
