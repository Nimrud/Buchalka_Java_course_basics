package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Polymorphism_challenge_Car{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            Car car = randomCar();
            System.out.println("Samochód nr " + i + ": " + car.getName());
            car.startEngine();
            car.accelerate(160);
            car.stopCar();
            System.out.println();
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        switch (randomNumber){
            case 1:
                return new Maluch(2);
            case 2:
                return new Polonez(4);
            case 3:
                return new Maybach(12);
            default:
                return new Car(6, "Jakiśtam samochód");
        }
    }
}

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine(){
        System.out.println("[default] Silnik odpalił.");
    }

    public void accelerate(int speed){
        System.out.println("[default] Samochód przyspieszył do " + speed + " km/h.");
    }

    public void stopCar(){
        System.out.println("[default] Samochód się zatrzymał.");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }
}

class Maluch extends Car{
    public Maluch(int cylinders) {
        super(cylinders, "Maluch");
    }

    @Override
    public void startEngine() {
        System.out.println("O matko, odpalił!!!");
    }

    @Override
    public void accelerate(int speed) {
        if (speed > 100){
            System.out.println("Łoooo, panie...");
        } else {
            System.out.println("Może nie najszybciej, ale jako-tako.");
        }
    }

    @Override
    public void stopCar() {
        System.out.println("Zepsuł się, maluszek.");
    }
}

class Polonez extends Car{
    public Polonez(int cylinders) {
        super(cylinders, "Polonez");
    }

    @Override
    public void startEngine() {
        System.out.println("Ojej, odpalił... Za pierwszym razem!");
    }

    @Override
    public void accelerate(int speed) {
        if (speed > 150){
            System.out.println("U drzwi Twoich stoję, Panie...");
        } else if (speed > 100){
            System.out.println("Mknie jak rakieta.");
        } else {
            System.out.println("Jedziemy!");
        }
    }

    @Override
    public void stopCar() {
        System.out.println("Panie na lewo, panowie na prawo.");
    }
}

class Maybach extends Car{
    public Maybach(int cylinders) {
        super(cylinders, "Maybach");
    }

    @Override
    public void startEngine() {
        System.out.println("Przejedźmy się, niech ludzie zazdroszczą.");
    }

    @Override
    public void stopCar() {
        System.out.println("Zatrzymajmy się i rozdajmy biedakom trochę grosza.");
    }
}

// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
