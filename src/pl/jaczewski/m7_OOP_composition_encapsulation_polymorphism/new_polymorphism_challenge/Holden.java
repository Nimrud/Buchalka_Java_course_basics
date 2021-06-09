package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism.new_polymorphism_challenge;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return Holden.class.getSimpleName() + " -> start engine()";
    }

    @Override
    public String accelerate() {
        return Holden.class.getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return Holden.class.getSimpleName() + " -> brake()";
    }
}
