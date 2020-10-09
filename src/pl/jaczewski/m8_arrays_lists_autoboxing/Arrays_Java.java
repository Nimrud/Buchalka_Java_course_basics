package pl.jaczewski.m8_arrays_lists_autoboxing;

import java.util.Scanner;

public class Arrays_Java {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] integersFromConsole = getIntegers(5);
        for (int i = 0; i < integersFromConsole.length; i++){
            System.out.println("Integer number " + (i + 1) + " was " + integersFromConsole[i]);
        }

        System.out.println("Average of those numbers is: " + average(integersFromConsole));
    }

    public static int[] getIntegers(int number){
        System.out.println("Please enter " + number + " values: ");
        int[] values = new int[number];
        for (int i =0; i < number; i++){
            System.out.print("Value number " + (i + 1) + ": ");
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static double average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = (double) sum / array.length;
        return average;
    }
}
