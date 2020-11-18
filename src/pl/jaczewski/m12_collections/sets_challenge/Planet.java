package pl.jaczewski.m12_collections.sets_challenge;

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, BodyType.PLANET, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == BodyType.MOON){
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
