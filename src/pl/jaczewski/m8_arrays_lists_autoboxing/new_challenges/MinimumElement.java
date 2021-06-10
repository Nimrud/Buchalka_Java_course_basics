package pl.jaczewski.m8_arrays_lists_autoboxing.new_challenges;

import java.util.Scanner;

public class MinimumElement {
    // CHALLENGE
    // Write a method called readInteger() that has no parameters and returns an int.
    // It needs to read in an integer from the user
    // - this represents how many elements the user needs to enter.

    // Write another method called readElements() that has one parameter of type int.
    // The method needs to read from the console until all the elements are entered,
    // and then return an array containing the elements entered.
    //
    // And finally, write a method called findMin() with one parameter of type int[].
    // The method needs to return the minimum value in the array.
    //
    // The scenario is:
    // 1. readInteger() is called.
    // 2. The number returned by readInteger() is then used to call readElements().
    // 3. The array returned from readElements() is used to call findMin().
    // 4. findMin() returns the minimum number.
    // [Do not try and implement this. It is to give you an idea of how the methods will be used]
    //
    // TIP: Assume that the user will only enter numbers, never letters.
    // TIP: Instantiate (create) the Scanner object inside the method.
    // There are two scanner objects, one for each of the two methods that are reading in input from the user.
    // NOTE: All methods should be defined as private static.


    private static int readInteger() {
        System.out.print("Please enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Number of elements: " + size);
        return size;
    }

    private static int[] readElements(int numberOfElements) {
        int[] array = new int[numberOfElements];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Please enter number #" + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    private static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i<array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Min value: " + minValue);
        return minValue;
    }

    public static void main(String[] args) {

        findMin(readElements(readInteger()));
    }
}
