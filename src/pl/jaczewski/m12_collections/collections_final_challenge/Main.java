package pl.jaczewski.m12_collections.collections_final_challenge;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 2.99, 100);
        stockList.addStock(temp);

        temp = new StockItem("water", 2.79, 60);
        stockList.addStock(temp);

        temp = new StockItem("tomatoes", 5.99, 20);
        stockList.addStock(temp);

        temp = new StockItem("chocolate", 3.99, 40);
        stockList.addStock(temp);

        temp = new StockItem("olives", 5.99, 10);
        stockList.addStock(temp);

        System.out.println(stockList);
        System.out.println();
        System.out.println(stockList.PriceList());
        System.out.println();

        Basket firstBasket = new Basket("First");
        reserveItem(firstBasket, "water", 3);
        reserveItem(firstBasket, "chocolate", 38);
        reserveItem(firstBasket, "bread", 2);
        reserveItem(firstBasket, "tomatoes", 3);
        unReserveItem(firstBasket, "tomatoes", 2);
        unReserveItem(firstBasket, "tomatoes", 2);
        System.out.println(firstBasket);
        System.out.println("===");

        System.out.println(stockList);
        System.out.println();

        Basket secondBasket = new Basket("Second");
        reserveItem(secondBasket, "chocolate", 10);
        unReserveItem(secondBasket, "goggles", 10);   // tego przedmiotu nie ma w sklepie
        System.out.println(secondBasket);
        System.out.println("===");

        checkout(firstBasket);
        System.out.println("===");
        checkout(secondBasket);

        System.out.println("======");
        System.out.println(stockList);

        System.out.println(firstBasket);
        System.out.println(secondBasket);
    }

    public static int reserveItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.getItem(item);
        if (stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveItem(item, quantity) != 0){
            System.out.println(item + " (" + quantity + ") added to " + basket.getName() + " basket.");
            return basket.addToBasket(stockItem, quantity);
        }
        System.out.println("There is not enough " + item + " in stock! Reservation impossible.");
        return 0;
    }

    public static int unReserveItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.getItem(item);
        if (stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity){
            System.out.println(item + " (" + quantity + ") removed from " + basket.getName() + " basket.");
            return stockList.unReserveItem(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket){
        if (basket.Items().isEmpty()) {
            System.out.println("Basket " + basket.getName() + " is empty. No items have been purchased.");
            return;
        }

        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()){
            if (stockList.sellStock(item.getKey().getName(), item.getValue()) > 0){
                System.out.println("=> " + item.getKey().getName() + " purchased.");
            } else {
                System.out.println("!!! " + item.getKey().getName() + " not purchased. Either not enough items in stock or reservation cancelled.");
            }
        }
        System.out.println("Items from basket " + basket.getName() + " checked out. The basket has been cleared.");

        basket.clearBasket();
    }
}

/*

    Modify the program so that adding items to the shopping basket doesn't
    actually reduce the stock count but, instead, reserves the requested
    number of items.

    You will need to add a "reserved" field to the StockItem class to store the
    number of items reserved.

    Items can continue to be added to the basket, but it should not be possible to
    reserve more than the available stock of any item. An item's available stock
    is the stock count less the reserved amount.

    The stock count for each item is reduced when a basket is checked out, at which
    point all reserved items in the basket have their actual stock count reduced.

    Once checkout is complete, the contents of the basket are cleared.

    It should also be possible to "unreserve" items that were added to the basket
    by mistake.

    The program should prevent any attempt to unreserve more items than were
    reserved for a basket.

    Add code to Main that will unreserve items after they have been added to the basket,
    as well as unreserving items that have not been added to make sure that the code
    can cope with invalid requests like that.

    After checking out the baskets, display the full stock list and the contents of each
    basket that you created.

     */
