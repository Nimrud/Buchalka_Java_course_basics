package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes_challenge;

public abstract class Cities {
    private String name;
    private int numberOfCitizens;
    private Cities left = null;
    private Cities right = null;

    public Cities(String name, int numberOfCitizens) {
        this.name = name;
        this.numberOfCitizens = numberOfCitizens;
    }

    abstract Cities next();
    abstract Cities previous();
    abstract Cities setPrevious(Cities city);
    abstract Cities setNext(Cities city);

    abstract int compareTo(Cities city);

    public String getName() {
        return name;
    }

    public Cities setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public Cities setNumberOfCitizens(int numberOfCitizens) {
        this.numberOfCitizens = numberOfCitizens;
        return this;
    }
}
