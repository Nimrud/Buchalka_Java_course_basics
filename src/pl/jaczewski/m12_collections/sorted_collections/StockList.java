package pl.jaczewski.m12_collections.sorted_collections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        // LinkedHashMap (w odróżnieniu od HashMap) używa przedmiotów w tej samej kolejności, w której zostały dodane
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if (item != null){
            // pobieramy przedmiot z listy (sklepu) lub - jeśli go nie ma w sklepie - przekazujemy go z metody:
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // jeśli mamy ten przedmiot w sklepie (jest już w mapie), to zmieniamy jego ilość:
            if (inStock != item){
                // pobieramy już istniejącą ilość/liczbę ze sklepu, a nast. dodajemy do ilości/liczby przedmiotu:
                item.adjustStock(inStock.QuantityInStock());
            }
            // update listy lub stworzenie nowego rekordu (jeśli przedmiotu na niej nie było):
            list.put(item.getName(), item);
            return item.QuantityInStock();
        }
        // jeżeli przedmiot jest nullem, to nie zmieniamy wartości:
        return 0;
    }

    public int sellStock(String name, int quantity){
        StockItem inStock = list.get(name);

        if ((inStock != null) && (quantity > 0) && (inStock.QuantityInStock() >= quantity)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem getItem(String name){
        return list.get(name);
    }

    public Map<String, StockItem> Items() {
        // zwraca nieedytowalną listę - nie trzeba tworzyć kopii listy (jak w maps_adventure_game)
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0;
        for (Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double totalItemValue = stockItem.QuantityInStock() * stockItem.getPrice();

            s = s + stockItem + ". There are " + stockItem.QuantityInStock() + " in Stock. Value of items: ";
            s = s + String.format("%.2f", totalItemValue) + "\n";
            totalCost += totalItemValue;
        }
        return s + "Total Stock value: " + String.format("%.2f", totalCost);
    }
}
