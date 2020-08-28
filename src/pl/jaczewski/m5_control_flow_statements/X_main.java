package pl.jaczewski.m5_control_flow_statements;

public class X_main {
    public static void main(String[] args) {

        // Switch challenge
        Switch_challenge.printDayOfTheWeek(8);


        // Zadanie 12
        System.out.print("Zadanie 12: ");
        X_exercise12.printNumberInWord(10);

        // Zadanie 13
        System.out.println("Zadanie 13a: " + X_exercise13.isLeapYear(2000));
        System.out.println("Zadanie 13b: " + X_exercise13.getDaysInMonth(2, 2018));

        // Zadanie 14
        System.out.println("Zadanie 14: " + X_exercise14.sumOdd(100, 1000));

        // Zadanie 15
        System.out.println("Zadanie 15: " + X_exercise15.isPalindrome(11212));

        // Zadanie 16
        System.out.println("Zadanie 16: " + X_exercise16.sumFirstAndLastDigit(257));

        // Zadanie 17
        System.out.println("Zadanie 17: " + X_exercise17.getEvenDigitSum(123456789));

        // Zadanie 18
        System.out.println("Zadanie 18: " + X_exercise18.hasSharedDigit(15,55));

        // Zadanie 19
        System.out.println("Zadanie 19: " + X_exercise19.hasSameLastDigit(23, 32, 422));

        // Zadanie 20
        System.out.println("Zadanie 20: " + X_exercise20.getGreatestCommonDivisor(1010, 10));

        // Zadanie 21
        System.out.println("Zadanie 21:");
        X_exercise21.printFactors(32);

        // Zadanie 22
        System.out.println("Zadanie 22: " + X_exercise22.isPerfectNumber(28));

        // Zadanie 23
        System.out.println("Zadanie 23: ");
        X_exercise23.numberToWords(101);

        // Zadanie 24
        System.out.println("Zadanie 24: " + X_exercise24.canPack(2,1,5));

        // Zadanie 25
        System.out.println("Zadanie 25: " +X_exercise25.getLargestPrime(45));

        // Zadanie 26
        System.out.println("Zadanie 26:");
        X_exercise26.printSquareStar(10);
        System.out.println();

        // Zadanie 27
//        System.out.println("Zadanie 27:");
//        X_exercise27.inputThenPrintSumAndAverage();

        // Zadanie 28
        System.out.println("Zadanie 28a: " + X_exercise28.getBucketCount(2.75,3.25, 2.5, 1));
        System.out.println("Zadanie 28b: " + X_exercise28.getBucketCount(7.25,4.3, 2.35));
        System.out.println("Zadanie 28c: " + X_exercise28.getBucketCount(3.26,0.75));


    }
}
