package pl.jaczewski.m12_collections.new_challenges.sets;

public class Planet extends HeavenlyBody{
    // write code here

    public Planet(String name, double orbitalPeriod) {
        super(name, BodyType.PLANET, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody body) {
        //TODO
        return false;
    }
}
