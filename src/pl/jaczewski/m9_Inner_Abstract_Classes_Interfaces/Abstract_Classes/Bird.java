package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes;

public abstract class Bird extends Animal implements CanFly {
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

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}
