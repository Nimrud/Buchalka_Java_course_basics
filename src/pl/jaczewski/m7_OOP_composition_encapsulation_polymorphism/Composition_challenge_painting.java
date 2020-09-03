package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Composition_challenge_painting {
    private String artist;
    private String title;
    private double price;

    public Composition_challenge_painting(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    public void displayPainting(){
        System.out.println(artist + "'s " + title + " has been displayed on the wall.");
        System.out.println("It's worth $" + price + "!!!");
    }

    public void stealPainting(){
        System.out.println("Oh no! Someone has stolen it when we were in the kitchen!");
    }
}
