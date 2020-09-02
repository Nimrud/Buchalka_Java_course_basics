package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class Inheritance_challenge_Ford extends Inheritance_challenge_Car{

    private double price;

    public Inheritance_challenge_Ford(int engine, int doors, boolean roof, int numberOfGears, double maxSpeed, double price) {
        super(engine, doors, roof, numberOfGears, maxSpeed, "Ford");
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Inheritance_challenge_Ford setPrice(double price) {
        this.price = price;
        return this;
    }


}
