package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class X_exercise35b_Cylinder extends X_exercise35a_Circle{

    private double height;

    public X_exercise35b_Cylinder(double radius, double height) {
        super(radius);
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
