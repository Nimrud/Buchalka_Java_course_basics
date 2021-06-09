package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism.new_burgerbar_challenge;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat +
                ", price is " + price);
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public double itemizeHamburger() {
        double finalPrice = this.price;
        if (this.addition1Price >= 0) {
            finalPrice += addition1Price;
        }
        if (this.addition2Price >= 0) {
            finalPrice += addition2Price;
        }
        if (this.addition3Price >= 0) {
            finalPrice += addition3Price;
        }
        if (this.addition4Price >= 0) {
            finalPrice += addition4Price;
        }
        return finalPrice;
    }
}
