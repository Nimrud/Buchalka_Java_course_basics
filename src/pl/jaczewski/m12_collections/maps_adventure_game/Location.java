package pl.jaczewski.m12_collections.maps_adventure_game;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        // w tym getterze tworzymy kopię Mapy, aby nic spoza tej klasy nie miało dostępu do oryginalnej Mapy
        // i nie mogło jej modyfikować
        // getter zwraca tu tylko kopię [exits]
        return new HashMap<String, Integer>(exits);
    }
}
