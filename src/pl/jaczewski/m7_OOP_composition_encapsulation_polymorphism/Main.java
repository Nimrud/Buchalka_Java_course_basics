package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Main {
    public static void main(String[] args) {

        // Composition challenge
        System.out.println("Composition challenge:");
        Composition_challenge_chair chair1 = new Composition_challenge_chair(80, 80, 100);
        Composition_challenge_table table1 = new Composition_challenge_table(6, 300, 150, 100);
        Composition_challenge_painting painting1 = new Composition_challenge_painting("El Greco", "View of Toledo", 1000000);
        Composition_challenge_Room livingRoom = new Composition_challenge_Room(chair1, chair1, chair1, table1, painting1);
        System.out.println("This is a table for " + livingRoom.getTable().getNumberOfSeats() + " people.");
        livingRoom.painting.displayPainting();
        livingRoom.painting.stealPainting();
    }
}
