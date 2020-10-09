package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        //super.fly();
        System.out.println(getName() + " cannot fly. Prefers swimming.");
    }
}
