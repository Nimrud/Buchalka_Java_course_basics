package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class X_exercise33c_Calculator {

    private X_exercise33a_Floor floor;
    private X_exercise33b_Carpet carpet;

    public X_exercise33c_Calculator(X_exercise33a_Floor floor, X_exercise33b_Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}
