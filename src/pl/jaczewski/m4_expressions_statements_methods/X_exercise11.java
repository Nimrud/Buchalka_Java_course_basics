package pl.jaczewski.m4_expressions_statements_methods;

public class X_exercise11 {

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer) {
            if ((temperature >= 25) && (temperature <= 45)){
                return true;
            } else {
                return false;
            }
        } else {
            if ((temperature >= 25) && (temperature <= 35)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
