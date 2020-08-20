package pl.jaczewski.m_4_expressions_statements_methods;

// a number is 'teen' if it's in range of 13-19
public class X_exercise07 {
    public static boolean hasTeen (int firstValue, int secondValue, int thirdValue) {
        if ((firstValue >= 13 && firstValue <= 19)
            || (secondValue >= 13 && secondValue <= 19)
            || (thirdValue >= 13 && thirdValue <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int newValue) {
        if (newValue >= 13 && newValue <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
