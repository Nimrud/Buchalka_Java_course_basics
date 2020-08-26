package pl.jaczewski.m5_control_flow_statements;

public class X_exercise18 {

    public static boolean hasSharedDigit (int numberOne, int numberTwo) {
        if ((numberOne >= 10) && (numberOne < 100) && (numberTwo >= 10) && (numberTwo < 100)){
            int firstDigitInOne = (numberOne / 10) % 10;
            int secondDigitInOne = numberOne % 10;
            int firstDigitInTwo = (numberTwo / 10) % 10;
            int secondDigitInTwo = numberTwo % 10;
            if (((firstDigitInOne == firstDigitInTwo) || (firstDigitInOne == secondDigitInTwo))
                || ((secondDigitInOne == firstDigitInTwo) || (secondDigitInOne == secondDigitInTwo))){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

// Nie korzystałem z pętli 'while', ponieważ to bez sensu przy ograniczeniu wartości parametrów do tak małego zakresu (od 10 do 99).

/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */