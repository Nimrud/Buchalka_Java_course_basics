package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Composition_challenge_chair {
    private int width;
    private int depth;
    private int height;

    public Composition_challenge_chair(int width, int depth, int height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
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
