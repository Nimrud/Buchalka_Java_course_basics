package pl.jaczewski.m12_collections.sets_challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {
    public static Set<HeavenlyBody> objects = new HashSet<>();
    public static Set<HeavenlyBody> planets = new HashSet<>();
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();

    public static void main(String[] args) {
        HeavenlyBody mercury = new Planet("Mercury", 88);
        objects.add(mercury);
        planets.add(mercury);
        HeavenlyBody venus = new Planet("Venus", 225);
        objects.add(venus);
        planets.add(venus);
        HeavenlyBody betaMinor1 = new HeavenlyBody("Beta Minor", HeavenlyBody.BodyType.PLANET, 1000);
        objects.add(betaMinor1);
        planets.add(betaMinor1);
        HeavenlyBody betaMinor2 = new HeavenlyBody("Beta Minor", HeavenlyBody.BodyType.MOON, 1000);
        objects.add(betaMinor2);

        // equals method test:
        System.out.println("\t" + betaMinor1.equals(betaMinor2));
        //toString method test:
        System.out.println(mercury.toString());

        HeavenlyBody earth = new Planet("Earth", 365);
        objects.add(earth);
        planets.add(earth);

        HeavenlyBody moon = new Moon("Moon", 27);
        objects.add(moon);
        earth.addSatellite(moon);

        HeavenlyBody mars = new Planet("Mars", 687);
        objects.add(mars);
        planets.add(mars);

        HeavenlyBody deimos = new Moon("Deimos", 1.3);
        objects.add(deimos);
        mars.addSatellite(deimos);
        mars.addSatellite(earth);   // nie działa, bo w podklasie Planet ograniczyłem możliwość dodania księżyca tylko do obiektów klasy Księżyc

        System.out.println("--------");
        for (HeavenlyBody p : planets){
            System.out.println(p.getName() + ": " + p.getSatellites());
        }

        System.out.println("=========");
        for (HeavenlyBody o: objects){
            System.out.println(o.getName() + ": " + o.getBodyType());
        }
    }
}

/*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

        You can include as many types as you want, but must support at
        least PLANET and MOON.

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.

        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.

        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.

        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).

        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.

        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).

        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.

        5. Two bodies with the same name but different designations can be added to the same set.

        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
*/
