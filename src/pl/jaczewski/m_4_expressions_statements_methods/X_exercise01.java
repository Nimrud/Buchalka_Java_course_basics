package pl.jaczewski.m_4_expressions_statements_methods;

// zadanie 'Speed Converter'
public class X_exercise01 {

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            return Math.round(kilometersPerHour * 0.621371);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid value");
        }
    }
}