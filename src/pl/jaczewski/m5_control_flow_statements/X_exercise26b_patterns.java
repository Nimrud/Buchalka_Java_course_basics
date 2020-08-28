package pl.jaczewski.m5_control_flow_statements;

import java.util.Scanner;
import java.util.regex.Pattern;

public class X_exercise26b_patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("=");
            }
            System.out.print("*");

            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print("_");
            }
            if (i == 1) {
                System.out.println("");
            } else {
                System.out.println("o");
            }
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print("s");
            }
            System.out.print("r");
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1)
                System.out.println("y");
            else
                System.out.println("*");
        }
        sc.close();
    }
}

/*
Pattern codes:
https://www.edureka.co/blog/30-pattern-programs-in-java/
https://medium.com/edureka/pattern-programs-in-java-f33186c711c8
*/