package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class X_exercise36b_Cuboid extends X_exercise36a_Rectangle {

    private double height;

    public X_exercise36b_Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
