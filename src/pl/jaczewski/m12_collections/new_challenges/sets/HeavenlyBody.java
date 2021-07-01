package pl.jaczewski.m12_collections.new_challenges.sets;

/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyType);
    }

    public enum BodyTypes {
        PLANET, DWARF_PLANET, MOON
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
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
            BodyTypes objectBodyType = ((Key) obj).getBodyType();

            return ((this.bodyType == objectBodyType) && (this.name.equals(objectName)));
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodyType.hashCode() + 26;
        }

        @Override
        public String toString() {
            return name + ": " + bodyType.toString();
        }
    }

    public boolean addSatellite(HeavenlyBody body) {
        if (body != null) {
            satellites.add(body);
            return true;
        }
        return false;
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        Key objectKey = ((HeavenlyBody) obj).getKey();
        return this.key.equals(objectKey);
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return key.getName() + ": " + key.getBodyType().toString() + ", " + orbitalPeriod;
    }
}
