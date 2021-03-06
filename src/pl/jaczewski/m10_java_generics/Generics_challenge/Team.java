package pl.jaczewski.m10_java_generics.Generics_challenge;

public abstract class Team {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;

    public Team(String name, int played, int won, int lost, int tied) {
        this.name = name;
        this.played = played;
        this.won = won;
        this.lost = lost;
        this.tied = tied;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    private int ranking(){
        return won * 3 + tied;
    }

    @Override
    public String toString() {
        return name + ": " + ranking();
    }
}
