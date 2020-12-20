package pl.jaczewski.m12_collections.collections_final_challenge;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;
    private int reserved;


    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int QuantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }
    }

    public void addReserved(int quantity){
        if (quantity <= this.quantityStock){
            this.reserved = quantity;
        }
    }

    public void unreserve(int quantity){
        this.reserved -= quantity;
    }

    public int adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0){
            return this.quantityStock = newQuantity;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((StockItem) obj).getName();
        if (objName.equals(this.name)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }

    @Override
    public int compareTo(StockItem o) {
        if (o == this){
            return 0;
        }
        if (o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " (price: " + this.price + ")";
    }
}
