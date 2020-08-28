package pl.jaczewski.m5_control_flow_statements;

import java.util.Scanner;

public class Scanner_input_challenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            System.out.print("Enter number #" + (counter + 1) + ": ");
            boolean hasNextInt = sc.hasNextInt();
            if (!hasNextInt) {
                System.out.println("Invalid number.");
                sc.nextLine();
            } else {
                int value = sc.nextInt();
                sc.nextLine();
                counter++;
                sum += value;
            }
        }
        System.out.println("The sum of " + counter + " typed in numbers is " + sum);

        sc.close();
    }
}
