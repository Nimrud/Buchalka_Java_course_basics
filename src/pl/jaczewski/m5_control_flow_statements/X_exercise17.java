package pl.jaczewski.m5_control_flow_statements;

public class X_exercise17 {

    public static int getEvenDigitSum (int number) {
        int sum = 0;
        int lastDigit;
        if (number < 0) {
            return -1;
        } else if (number == 0){
            return sum;
        } else {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0){
                    sum += lastDigit;
                }
                number = number / 10;
            }
            return sum;
        }
    }
}


/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */