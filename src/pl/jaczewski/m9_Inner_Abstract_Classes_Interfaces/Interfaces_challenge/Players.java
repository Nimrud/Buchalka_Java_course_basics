package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Interfaces_challenge;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable{

    private String name;
    private int strength;
    private int dexterity;
    private int health;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private double money;


    public Players(String name, int strength, int dexterity, int health, int intelligence, int wisdom, int charisma, double money) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.health = health;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.money = money;
    }

    @Override
    public List saveObject() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.strength);  // dodanie "" przed intem zamienia całe wyrażenie na Stringa
        values.add(2, "" + this.dexterity);
        values.add(3, "" + this.health);
        values.add(4, "" + this.intelligence);
        values.add(5, "" + this.wisdom);
        values.add(6, "" + this.charisma);
        values.add(7, "" + this.money);

        return values;
    }

    @Override
    public void populateFields(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.strength = Integer.parseInt(savedValues.get(1));
            this.dexterity = Integer.parseInt(savedValues.get(2));
            this.health = Integer.parseInt(savedValues.get(3));
            this.intelligence = Integer.parseInt(savedValues.get(4));
            this.wisdom = Integer.parseInt(savedValues.get(5));
            this.charisma = Integer.parseInt(savedValues.get(6));
            this.money = Integer.parseInt(savedValues.get(7));
        }
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", health=" + health +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public Players setName(String name) {
        this.name = name;
        return this;
    }

    public int getStrength() {
        return strength;
    }

    public Players setStrength(int strength) {
        this.strength = strength;
        return this;
    }

    public int getDexterity() {
        return dexterity;
    }

    public Players setDexterity(int dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public Players setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public Players setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public int getWisdom() {
        return wisdom;
    }

    public Players setWisdom(int wisdom) {
        this.wisdom = wisdom;
        return this;
    }

    public int getCharisma() {
        return charisma;
    }

    public Players setCharisma(int charisma) {
        this.charisma = charisma;
        return this;
    }

    public double getMoney() {
        return money;
    }

    public Players setMoney(double money) {
        this.money = money;
        return this;
    }
}
