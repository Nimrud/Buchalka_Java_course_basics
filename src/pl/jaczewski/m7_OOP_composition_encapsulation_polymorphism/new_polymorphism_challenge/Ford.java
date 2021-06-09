package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism.new_polymorphism_challenge;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return Ford.class.getSimpleName() + " -> start engine()";
    }

    @Override
    public String accelerate() {
        return Ford.class.getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return Ford.class.getSimpleName() + " -> brake()";
    }
}
