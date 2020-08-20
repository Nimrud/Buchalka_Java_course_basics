package pl.jaczewski.m_4_expressions_statements_methods;

public class X_excercise1_example {
    public static void main(String[] args) {
        checkNumber(-100);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
