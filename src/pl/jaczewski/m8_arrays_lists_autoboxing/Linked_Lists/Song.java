package pl.jaczewski.m8_arrays_lists_autoboxing.Linked_Lists;

public class Song {
    private String title;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.getTitle() + ": " + this.getDuration() +"s.";
    }
}
