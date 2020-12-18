package pl.jaczewski.m12_collections.collections_final_challenge;

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
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if (inStock != item) {
                item.adjustStock(inStock.QuantityInStock());
            }
            list.put(item.getName(), item);
            return item.QuantityInStock();
        }
        return 0;
    }

    public int reserveItem(String name, int quantity) {
        StockItem inStock = list.get(name);
        if ((inStock != null) && (quantity > 0) && (inStock.QuantityInStock() >= quantity)) {
            inStock.addReserved(quantity);
            return quantity;
        }
        return 0;
    }

    public int unReserveItem(String name, int quantity){
        StockItem inStock = list.get(name);
        if ((inStock != null) && (quantity > 0)) {
            inStock.unreserve(quantity);
            return quantity;
        }
        return 0;
    }

    public int sellStock(String name, int quantity) {
        StockItem inStock = list.get(name);
        if ((inStock != null) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem getItem(String name) {
        return list.get(name);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double totalItemValue = stockItem.QuantityInStock() * stockItem.getPrice();

            s = s + stockItem + ". There are " + stockItem.QuantityInStock() + " in Stock. Value of items: ";
            s = s + String.format("%.2f", totalItemValue) + "\n";
            totalCost += totalItemValue;
        }
        return s + "Total Stock value: " + String.format("%.2f", totalCost);
    }
}
