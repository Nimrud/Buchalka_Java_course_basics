package pl.jaczewski.m5_control_flow_statements;

import java.util.Calendar;
import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");

        // Sprawdzanie, czy wprowadzona wartość jest intem
        boolean hasNextInt = sc.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = sc.nextInt();
            sc.nextLine();   // konieczne, aby skaner przeczytał następny input!

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;

            // Na tym etapie w kursie nie było jeszcze walidacji wprowadzanych danych
            if (age >= 5 && age <= 90) {
                System.out.println(" Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }


        sc.close();
    }
}
