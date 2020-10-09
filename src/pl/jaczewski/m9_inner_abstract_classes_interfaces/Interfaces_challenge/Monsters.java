package pl.jaczewski.m9_inner_abstract_classes_interfaces.Interfaces_challenge;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable {

    private String name;
    private int health;
    private int damage;

    public Monsters(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    @Override
    public List saveObject() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, "" + this.damage);
        return values;
    }

    @Override
    public void populateFields(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.damage = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
