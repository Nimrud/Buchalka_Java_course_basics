package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism.new_polymorphism_challenge;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return Mitsubishi.class.getSimpleName() + " -> start engine()";
    }

    @Override
    public String accelerate() {
        return Mitsubishi.class.getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return Mitsubishi.class.getSimpleName() + " -> brake()";
    }
}
