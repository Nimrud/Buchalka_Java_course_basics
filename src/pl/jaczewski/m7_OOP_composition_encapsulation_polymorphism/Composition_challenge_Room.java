package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Composition_challenge_Room {
    public Composition_challenge_chair chair1;
    public Composition_challenge_chair chair2;
    public Composition_challenge_chair chair3;
    public Composition_challenge_table table;
    public Composition_challenge_painting painting;

    public Composition_challenge_Room(Composition_challenge_chair chair1, Composition_challenge_chair chair2, Composition_challenge_chair chair3, Composition_challenge_table table, Composition_challenge_painting painting) {
        this.chair1 = chair1;
        this.chair2 = chair2;
        this.chair3 = chair3;
        this.table = table;
        this.painting = painting;
    }

    public Composition_challenge_chair getChair1() {
        return chair1;
    }

    public Composition_challenge_chair getChair2() {
        return chair2;
    }

    public Composition_challenge_chair getChair3() {
        return chair3;
    }

    public Composition_challenge_table getTable() {
        return table;
    }

    public Composition_challenge_painting getPainting() {
        return painting;
    }
}

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.