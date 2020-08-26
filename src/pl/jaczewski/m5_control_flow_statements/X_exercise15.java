package pl.jaczewski.m5_control_flow_statements;

public class X_exercise15 {

    public static boolean isPalindrome (int number) {
        if (number < 0) {
            number = number - number - number;
        }
        int reversed = 0;
        int baseNumber = number;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            reversed += lastDigit;
            if (number > 0){
                reversed *= 10;
            }
        }
        if (baseNumber == reversed){
            return true;
        } else {
            return false;
        }
    }
}

/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.

Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
Tip: Logic to check a palindrome number
Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
If both are the the same then the number is a palindrome otherwise it is not.
Tip: Be careful with negative numbers. They can also be palindrome numbers.
NOTE: The method isPalindrome needs to be defined as public static like we have been doing.
 */