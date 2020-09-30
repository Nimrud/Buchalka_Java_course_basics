package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes_challenge;

public class PolishCities extends Settlement{
    public PolishCities(String name, int numberOfCitizens) {
        super(name, numberOfCitizens);
    }

    @Override
    Settlement next() {
        return null;
    }

    @Override
    Settlement previous() {
        return null;
    }

    @Override
    Settlement setPrevious(Settlement settlement) {
        return null;
    }

    @Override
    Settlement setNext(Settlement settlement) {
        return null;
    }

    @Override
    int compareTo(Settlement settlement) {
        return 0;
    }
}
