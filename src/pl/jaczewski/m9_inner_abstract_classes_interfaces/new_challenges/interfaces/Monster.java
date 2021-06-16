package pl.jaczewski.m9_inner_abstract_classes_interfaces.new_challenges.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> attributes = new ArrayList<>();
        attributes.add(0, name);
        attributes.add(1, String.valueOf(hitPoints));
        attributes.add(2, String.valueOf(strength));
        return attributes;
    }

    @Override
    public void read(List<String> list) {
        if ((list != null) && (list.size() > 0)) {
            name = list.get(0);
            hitPoints = Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
        }
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "\'" +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength + "}";
    }
}
