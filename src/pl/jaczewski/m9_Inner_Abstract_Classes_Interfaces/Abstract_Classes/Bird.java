package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing like any other bird.");
    }

    public abstract void fly();
}
