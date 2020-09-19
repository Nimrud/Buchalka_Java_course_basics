package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Interfaces_challenge;

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
    public ArrayList saveObject() {
        ArrayList<Monsters> monsters = new ArrayList<>();
        monsters.add(new Monsters(name, health, damage));
        for (int i = 0; i < monsters.size(); i++){
            System.out.println(monsters.toString());
        }
        return monsters;
    }

    @Override
    public void populateFields(List arrayList) {

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
