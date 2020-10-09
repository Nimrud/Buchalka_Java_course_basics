package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes;

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
