package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class Inheritance_challenge_Car extends Inheritance_challenge_Vehicle{

    private int doors;
    private int wheels;
    private boolean roof;

    public Inheritance_challenge_Car(int engine, int doors, boolean roof, int numberOfGears, double speed, String name) {
        super(engine, numberOfGears, "steeringWheel", speed, name);
        this.doors = doors;
        this.roof = roof;
        this.wheels = 4;
    }

    @Override
    public void move(double speed) {
        System.out.println("Car has driven at " + speed + " km/h.");
    }

    public int getDoors() {
        return doors;
    }

    public Inheritance_challenge_Car setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public int getWheels() {
        return wheels;
    }

    public Inheritance_challenge_Car setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public boolean isRoof() {
        return roof;
    }

    public Inheritance_challenge_Car setRoof(boolean roof) {
        this.roof = roof;
        return this;
    }
}
