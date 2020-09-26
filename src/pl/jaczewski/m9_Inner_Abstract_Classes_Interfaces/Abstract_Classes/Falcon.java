package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes;

public class Falcon extends Bird{
    public Falcon(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying like no other bird.");
    }
}
