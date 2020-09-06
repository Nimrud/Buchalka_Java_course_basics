package pl.jaczewski.m8_Arrays_Lists_Autoboxing;

import java.util.Scanner;

public class Arrays_challenge1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] firstArray = getArray(5);
        for (int i = 0; i < firstArray.length; i++){
            System.out.println("Number " + (i + 1) + " was " + firstArray[i]);
        }

        int[] sortedArray = sortArray(firstArray);
        for (int i = 0; i < firstArray.length; i++){
            System.out.println("Sorted array: " + sortedArray[i]);
        }
    }

    public static int[] getArray(int arraySize){
        System.out.println("Type in " + arraySize + " numbers.");

        int[] newArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.print("Number " + (i + 1) + ": ");
            newArray[i] = sc.nextInt();
        }
        return newArray;
    }

    public static int[] sortArray(int[] array){
        int count = 0;
        while(count < array.length) {
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] < array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
            count++;
        }
        return array;
    }

}

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
