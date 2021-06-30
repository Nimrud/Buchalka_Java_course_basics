package pl.jaczewski.m12_collections.new_challenges.sets;

public class Planet extends HeavenlyBody {
    // write code here

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody body) {
        if (body.getKey().getBodyType() == BodyTypes.MOON) {
            if (!super.getSatellites().contains(body)) {
                return super.addSatellite(body);
            }
        }
        return false;
    }
}
