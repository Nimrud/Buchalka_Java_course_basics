package pl.jaczewski.m_4_expressions_statements_methods;

public class X_exercise03 {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if ((barking) &&
                ((hourOfDay > 22) && (hourOfDay < 24)
                || (hourOfDay >= 0) && (hourOfDay < 8))
        ) {
        return true;
        }
        return false;
    }
}
