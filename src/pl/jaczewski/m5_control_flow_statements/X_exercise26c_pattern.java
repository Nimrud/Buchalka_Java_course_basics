package pl.jaczewski.m5_control_flow_statements;

import java.util.Scanner;

public class X_exercise26c_pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = sc.nextInt();

        int start = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(start++ + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Podaj kolejną liczbę: ");
        number = sc.nextInt();

        for (int i = 0; i < number; i++){
            for (int j = (number - i); j > 0; j--) {
                System.out.print("- ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
