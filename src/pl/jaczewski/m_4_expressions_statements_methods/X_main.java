package pl.jaczewski.m_4_expressions_statements_methods;

// Klasa do testowania poprawności rozwiązań zadań do samodzielnego wykonania

public class X_main {
    public static void main(String[] args) {
        // Zadanie 1
        System.out.println(X_exercise01.toMilesPerHour(75.114));
        X_exercise01.printConversion(20.15);

        // Zadanie 2
        X_exercise02.printMegaBytesAndKiloBytes(5000);

        // Zadanie 3
        System.out.println("Zadanie 3: " + X_exercise03.shouldWakeUp(true, 1));

        // Zadanie 4
        System.out.println("Zadanie 4: " + X_exercise04.isLeapYear(1924));

        // Zadanie 5
        System.out.println("Zadanie 5: " + X_exercise05.areEqualByThreeDecimalPlaces(3.123, 3.1238));

        // Zadanie 6
        System.out.println("Zadanie 6: " + X_exercise06.hasEqualSum(1, -1, 0));

        // Zadanie 7
        System.out.println("Zadanie 7a: " + X_exercise07.hasTeen(23, 25,46));
        System.out.println("Zadanie 7b: " + X_exercise07.isTeen(15));

        // Zadanie 8
        System.out.println("Zadanie 8a: " + X_exercise08.area(12));
        System.out.println("Zadanie 8b: " + X_exercise08.area(8, 10));

        // Zadanie 9
        System.out.print("Zadanie 9: ");
        X_exercise09.printYearsAndDays(561609);
    }
}
