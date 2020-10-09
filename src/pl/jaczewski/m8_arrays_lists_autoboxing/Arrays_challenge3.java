package pl.jaczewski.m8_arrays_lists_autoboxing;

import java.util.Arrays;

public class Arrays_challenge3 {
    public static void main(String[] args) {
        int[] array = {1,26,731,-51,0,15};
        System.out.println("Base array: " + Arrays.toString(array));

        reverse(array);
    }

    public static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}

/*
-Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
 */