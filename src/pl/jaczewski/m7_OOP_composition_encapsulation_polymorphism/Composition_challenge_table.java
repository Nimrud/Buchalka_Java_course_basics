package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Composition_challenge_table {
    private int numberOfSeats;
    private int width;
    private int depth;
    private int height;

    public Composition_challenge_table(int numberOfSeats, int width, int depth, int height) {
        this.numberOfSeats = numberOfSeats;
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }
}
