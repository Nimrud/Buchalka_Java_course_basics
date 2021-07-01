package pl.jaczewski.m12_collections.collections_final_challenge;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved;


    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }
    }

    public int addReserved(int quantity) {
        if (quantity <= availableQuantity()) {
            this.reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserve(int quantity) {
        if (quantity <= this.reserved) {
            this.reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0){
            return this.quantityInStock = newQuantity;
        } else {
            return 0;
        }
    }

    public int finaliseStock(int quantity) {
        if (quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
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
        return this.name + " (price: " + this.price + "). Reserved: " + this.reserved;
    }
}
