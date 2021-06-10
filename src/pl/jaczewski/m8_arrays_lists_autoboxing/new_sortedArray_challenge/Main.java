package pl.jaczewski.m8_arrays_lists_autoboxing.new_sortedArray_challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    // CHALLENGE:
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it [106, 26, 81, 5, 15]
    // your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
    // Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
    //
    // Implement the following methods:
    // -> getIntegers() has one parameter of type int which is the size of the array.
    // It returns an array of entered integers from the keyboard.
    // -> printArray() accepts an array and prints out the contents of the array.
    // It should be printed in the following format:
    //  Element 0 contents 106
    //  Element 1 contents 81
    //  Element 2 contents 26
    //  Element 3 contents 15
    //  Element 4 contents 5
    //
    // -> sortIntegers() accepts the unsorted array. It should sort the array
    // and return a new array containing the sorted numbers.
    //
    // TIP: you will have to figure out how to copy the array elements from the passed array
    // into a new array and sort them and return the new sorted array.
    // TIP: Make sure the Scanner class is imported.
    // NOTE: All methods should be defined as public static NOT public.

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number of elements to be sorted out: ");
        int arraySize = sc.nextInt();
        int[] array = getIntegers(arraySize);

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Please enter #" + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();

        printArray(sortIntegers(array));
    }

    public static int[] getIntegers(int size) {
        return new int[size];
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] arrayDesc = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return arrayDesc;
    }
}
