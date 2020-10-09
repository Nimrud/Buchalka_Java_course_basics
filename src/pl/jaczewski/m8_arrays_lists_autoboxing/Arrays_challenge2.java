package pl.jaczewski.m8_arrays_lists_autoboxing;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_challenge2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a number of integers for this challenge: ");
        int count = sc.nextInt();
        sc.nextLine();

        int[] arrayFromConsole = readIntegers(count);
        System.out.println("Array: " + Arrays.toString(arrayFromConsole));
        System.out.println("Minimum number in this array is: " + findMin(arrayFromConsole));
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            System.out.print("Please enter #" + (i + 1) + " number: ");
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
 */