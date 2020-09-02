package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class Inheritance_challenge_Vehicle {

    private int engineType;
    private int numberOfGears;
    private String steeringMechanism;
    private double speed;
    private String name;

    public Inheritance_challenge_Vehicle(int engineType, int numberOfGears, String steeringMechanism, double speed, String name) {
        this.engineType = engineType;
        this.numberOfGears = numberOfGears;
        this.steeringMechanism = steeringMechanism;
        this.speed = speed;
        this.name = name;
    }

    public int getEngineType() {
        return engineType;
    }

    public Inheritance_challenge_Vehicle setEngineType(int engineType) {
        this.engineType = engineType;
        return this;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public Inheritance_challenge_Vehicle setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        return this;
    }

    public String getSteeringMechanism() {
        return steeringMechanism;
    }

    public Inheritance_challenge_Vehicle setSteeringMechanism(String steeringMechanism) {
        this.steeringMechanism = steeringMechanism;
        return this;
    }

    public double getSpeed() {
        return speed;
    }

    public Inheritance_challenge_Vehicle setSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public String getName() {
        return name;
    }

    public Inheritance_challenge_Vehicle setName(String name) {
        this.name = name;
        return this;
    }

    public void move(double speed){
        System.out.println("Vehicle has moved at " + speed + " km/h.");
    }

    public void stop(){
        System.out.println("Vehicle has stopped.");
    }
}
