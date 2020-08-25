package pl.jaczewski.m5_control_flow_statements;

public class While_statement_challenge {

    public static void main(String[] args) {

        int number = 128719;
        System.out.println("Sum of digits in " + number + " is: " + sumDigits(number));
    }

    public static int sumDigits (int number) {
        if (number >= 10) {

            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                sum += lastDigit;
                number /= 10;   // równoważnik: number = number / 10;
            }
            return sum;

//            Pierwsze podejście:
//                while (number < 100) {
//                    int lastDigit = number % 10;
//                    int firstDigit = number / 10;
//                    return lastDigit + firstDigit;
//                }
//
//                while (number < 1000) {
//                    int lastTwoDigits = number % 100;
//                    int lastDigit = lastTwoDigits % 10;
//                    int mediumDigit = lastTwoDigits / 10;
//                    int firstDigit = number / 100;
//                    return firstDigit + mediumDigit + lastDigit;
//                }
//
//                return -1;

        } else {
            return -1;
        }
    }
}

/*
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.

Hints:
	Use n % 10 to extract the least-significant digit.
	Use n = n / 10 to discard the least-significant digit.
	The method needs to be static like other methods so far in the course.
 */