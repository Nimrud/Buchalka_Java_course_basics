package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Abstract_Classes_challenge;

public class PolishCities extends Settlement{

    public PolishCities(String name, int numberOfCitizens) {
        super(name, numberOfCitizens);
    }

    @Override
    Settlement next() {
        return this.right;
    }

    @Override
    Settlement previous() {
        return this.left;
    }

    @Override
    Settlement setPrevious(Settlement settlement) {
        this.left = settlement;
        return this.left;
    }

    @Override
    Settlement setNext(Settlement settlement) {
        this.right = settlement;
        return this.right;
    }

    @Override
    int compareTo(Settlement settlement) {
        if (settlement.getPopulation() == super.getPopulation()){
            return 0;
        } else if (settlement.getPopulation() > super.getPopulation()){
            return 1;
        } else {
            return -1;
        }
    }

    private Settlement findSettlement(String name){
        //TODO
        return null;
    }
}
