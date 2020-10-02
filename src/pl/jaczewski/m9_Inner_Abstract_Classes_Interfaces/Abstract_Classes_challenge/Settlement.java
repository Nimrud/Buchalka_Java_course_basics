package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes_challenge;

public abstract class Settlement {
    protected String name;
    protected int population;
    protected Settlement left = null;
    protected Settlement right = null;

    public Settlement(String name, int numberOfCitizens) {
        this.name = name;
        this.population = numberOfCitizens;
    }

    abstract Settlement next();
    abstract Settlement previous();
    abstract Settlement setPrevious(Settlement settlement);
    abstract Settlement setNext(Settlement settlement);

    abstract int compareTo(Settlement settlement);

    public String getName() {
        return name;
    }

    public Settlement setName(String name) {
        this.name = name;
        return this;
    }

    public int getPopulation() {
        return population;
    }

    public Settlement setPopulation(int population) {
        this.population = population;
        return this;
    }
}
