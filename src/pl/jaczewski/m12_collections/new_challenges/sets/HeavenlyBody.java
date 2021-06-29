package pl.jaczewski.m12_collections.new_challenges.sets;

/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final Key key;
    private BodyType bodyType;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, BodyType bodyType, double orbitalPeriod) {
        this.name = name;
        this.bodyType = bodyType;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyType);
    }

    public enum BodyType {
        PLANET, DWARF_PLANET, MOON
    }

    public static final class Key {
        private String name;
        private BodyType bodyType;

        private Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if ((obj == null) || (obj.getClass() != this.getClass())) {
                return false;
            }

            String objectName = ((Key) obj).getName();
            BodyType objectBodyType = ((Key) obj).getBodyType();

            return ((this.bodyType.equals(objectBodyType)) && (this.name.equals(objectName)));
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodyType.hashCode() + 26;
        }

        @Override
        public String toString() {
            return name + ": " + bodyType;
        }
    }

    public boolean addSatellite(HeavenlyBody body) {
        if (body != null) {
            satellites.add(body);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public static Key makeKey(String name, BodyType bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        Key objectKey = ((HeavenlyBody) obj).getKey();
        return this.key.equals(objectKey);
    }

    @Override
    public final int hashCode() {
        System.out.println("hashcode called");
        return this.key.hashCode() + 57;
    }

    @Override
    public String toString() {
        return name + ": " + bodyType + ", " + orbitalPeriod;
    }
}
