package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes;

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
