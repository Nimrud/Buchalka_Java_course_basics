package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes;

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
