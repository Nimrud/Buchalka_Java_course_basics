package pl.jaczewski.m12_collections.collections_final_challenge;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity){
        if (item != null){
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;

            if (newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if (newQuantity == 0) {
                list.remove(item);
                return quantity;
            } else {
                System.out.println("You cannot remove more items than you have in the basket (currently: " + inBasket + ").");
            }
        }
        return 0;
    }

    public void clearBasket(){
        list.clear();
    }

    public String getName() {
        return name;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + (list.size() == 1 ? " item:" : " items:") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            // jeśli rezygnujemy z rezerwacji większej liczby danego towaru niż jest go w koszyku,
            // to ustawiamy całkowitą liczbę szt. rezerwacji na 0 (więc wyświetla się w koszyku, ale nie wpływa na wartość)
            if (item.getValue() <= 0){
                item.setValue(0);
                System.out.println("You haven't reserved so many " + item.getKey().getName() + "! Total number cleared.");
            }
            s = s + item.getKey() + "." + "\n";
            totalCost += item.getKey().getPrice() * item.getValue();


        }
        return s + "Total cost: " + String.format("%.2f", totalCost);
    }
}
