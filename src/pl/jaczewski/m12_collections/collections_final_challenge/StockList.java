package pl.jaczewski.m12_collections.collections_final_challenge;

import pl.jaczewski.m12_collections.sorted_collections.StockItem;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, pl.jaczewski.m12_collections.sorted_collections.StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(pl.jaczewski.m12_collections.sorted_collections.StockItem item){
        if (item != null){
            pl.jaczewski.m12_collections.sorted_collections.StockItem inStock = list.getOrDefault(item.getName(), item);
            if (inStock != item){
                item.adjustStock(inStock.QuantityInStock());
            }
            list.put(item.getName(), item);
            return item.QuantityInStock();
        }
        return 0;
    }

    public int sellStock(String name, int quantity){
        pl.jaczewski.m12_collections.sorted_collections.StockItem inStock = list.get(name);

        if ((inStock != null) && (quantity > 0) && (inStock.QuantityInStock() >= quantity)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public pl.jaczewski.m12_collections.sorted_collections.StockItem getItem(String name){
        return list.get(name);
    }

    public Map<String, pl.jaczewski.m12_collections.sorted_collections.StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, pl.jaczewski.m12_collections.sorted_collections.StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public pl.jaczewski.m12_collections.sorted_collections.StockItem get(String key){
        return list.get(key);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0;
        for (Map.Entry<String, pl.jaczewski.m12_collections.sorted_collections.StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double totalItemValue = stockItem.QuantityInStock() * stockItem.getPrice();

            s = s + stockItem + ". There are " + stockItem.QuantityInStock() + " in Stock. Value of items: ";
            s = s + String.format("%.2f", totalItemValue) + "\n";
            totalCost += totalItemValue;
        }
        return s + "Total Stock value: " + String.format("%.2f", totalCost);
    }
}
