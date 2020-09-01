package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class X_exercise33b_Carpet {

    private double cost;

    public X_exercise33b_Carpet(double cost) {
        if (cost < 0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost(){
        return cost;
    }
}
