package pl.jaczewski.m5_control_flow_statements;

public class X_exercise19 {

    public static boolean hasSameLastDigit (int par1, int par2, int par3) {
        if ((isValid(par1)) && (isValid(par2)) && (isValid(par3))) {
            if (((par1 % 10) == (par2 % 10))
            || ((par1 % 10) == (par3 % 10))
            || ((par2 % 10) == (par3 % 10))){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int number){
        if ((number >= 10) && (number <= 1000)) {
            return true;
        } else {
            return false;
        }
    }
}

/*
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


EXAMPLE INPUT/OUTPUT:
* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
 */