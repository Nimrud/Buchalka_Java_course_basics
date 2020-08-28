package pl.jaczewski.m5_control_flow_statements;

import java.util.Scanner;

public class Scanner_input_challenge2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstNumberEnteredByUser = false;

        while (true){
            System.out.print("Please enter a number: ");
            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();

                // poniższy kod wykona się dopiero, gdy użytkownik wprowadzi pierwszą poprawną liczbę
                // i nadpisze nią min i max
                if (!firstNumberEnteredByUser) {
                    firstNumberEnteredByUser = true;
                    min = number;
                    max = number;
                }

                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            } else {
                System.out.println("Invalid number!");
                if (firstNumberEnteredByUser){
                    System.out.println("Minimum number entered: " + min);
                    System.out.println("Maximum number entered: " + max);
                } else {
                    System.out.println("No valid numbers entered.");
                }
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
