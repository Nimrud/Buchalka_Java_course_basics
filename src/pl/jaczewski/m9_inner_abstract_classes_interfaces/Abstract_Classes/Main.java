package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mrrrr");
        cat.breathe();

        Falcon falcon = new Falcon("Saker Falcon");
        falcon.breathe();
        falcon.fly();

        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.breathe();
        penguin.fly();
    }
}
