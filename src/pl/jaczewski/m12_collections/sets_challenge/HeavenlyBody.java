package pl.jaczewski.m12_collections.sets_challenge;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    // Klasa nie jest już "final", bo będzie tu trzeba zrobić podklasy
    private final String name;
    private final BodyType bodyType;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, BodyType bodyType, double orbitalPeriod) {
        this.name = name;
        this.bodyType = bodyType;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public enum BodyType{
        PLANET, STAR, MOON
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    // Final - aby uniknąć kłopotów (equals not being symmetric)
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        BodyType objType = ((HeavenlyBody) obj).getBodyType();
        if ((this.name.equals(objName)) && (this.bodyType.equals(objType))){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        //System.out.println("hashcode called");
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + " (" + this.bodyType + "): " + this.orbitalPeriod;
    }
}
