package pl.jaczewski.m12_collections.sorted_collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    //lista zakupowa: key to artykuł ze sklepu, value to liczba sztuk, którą chcemy kupić
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity){
        if ((item != null) && (quantity > 0)){
            //sprawdzamy, czy w koszyku znajduje się już jakiś przedmiot tego rodzaju
            // jeśli tak, to dokładamy do niego wybraną liczbę szt.
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        // kod poniżej dla 1 przedmiotu wyświetla napis "item", a dla większej liczby - "items"
        String s = "\nShopping basket " + name + " contains " + list.size() + (list.size() == 1 ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + String.format("%.2f", totalCost);
    }
}
