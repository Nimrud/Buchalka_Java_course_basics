package pl.jaczewski.m4_expressions_statements_methods;

public class X_exercise05 {
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        if ((int)(firstNumber * 1000) == (int)(secondNumber * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
