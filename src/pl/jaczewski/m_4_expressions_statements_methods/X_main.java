package pl.jaczewski.m_4_expressions_statements_methods;

// Klasa do testowania poprawności rozwiązań zadań do samodzielnego wykonania

public class X_main {
    public static void main(String[] args) {
        // Zadanie 1
        System.out.println(X_excercise01.toMilesPerHour(75.114));
        X_excercise01.printConversion(20.15);

        // Zadanie 2
        X_excercise02.printMegaBytesAndKiloBytes(5000);

        // Zadanie 3
        System.out.println(X_excercise03.shouldWakeUp(true, 1));

        // Zadanie 4
        System.out.println(X_excercise04.isLeapYear(1924));
    }
}
