package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class Inheritance_challenge_Vehicle {

    private int engineType;
    private int numberOfGears;
    private String steeringMechanism;
    private double maxSpeed;
    private String name;

    public Inheritance_challenge_Vehicle(int engineType, int numberOfGears, String steeringMechanism, double maxSpeed, String name) {
        this.engineType = engineType;
        this.numberOfGears = numberOfGears;
        this.steeringMechanism = steeringMechanism;
        this.maxSpeed = maxSpeed;
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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Inheritance_challenge_Vehicle setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
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
