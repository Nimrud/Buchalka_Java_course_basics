package pl.jaczewski.m4_expressions_statements_methods;

public class X_exercise09 {

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (365 * 24 * 60);
            long minutesRemainder = minutes % (365 * 24 * 60);
            long days = minutesRemainder / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}

