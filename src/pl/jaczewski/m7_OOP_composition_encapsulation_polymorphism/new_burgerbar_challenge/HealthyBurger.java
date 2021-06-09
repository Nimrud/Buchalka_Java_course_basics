package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism.new_burgerbar_challenge;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
        System.out.println("Healthy burger on a Brown rye with " + meat +
                ", price is " + price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        super.addHamburgerAddition1(name, price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public double itemizeHamburger() {
        double finalPrice = super.itemizeHamburger();
        if ((healthyExtra1Name != null) && (healthyExtra2Name != null)) {
            System.out.println("Healthy burger with " + healthyExtra1Name + " and " + healthyExtra2Name);
        } else if (healthyExtra1Name != null) {
            System.out.println("Healthy burger with " + healthyExtra1Name);
        } else {
            System.out.println("Healthy burger");
        }
        return super.itemizeHamburger();
    }
}
