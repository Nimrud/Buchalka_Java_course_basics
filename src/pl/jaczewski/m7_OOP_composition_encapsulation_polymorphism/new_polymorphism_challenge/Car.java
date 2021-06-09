package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism.new_polymorphism_challenge;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return Car.class.getSimpleName() + " -> start engine()";
    }

    public String accelerate() {
        return Car.class.getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return Car.class.getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
