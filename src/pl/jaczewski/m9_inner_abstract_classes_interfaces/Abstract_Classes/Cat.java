package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }
}
