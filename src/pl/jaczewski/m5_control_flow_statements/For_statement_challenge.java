package pl.jaczewski.m5_control_flow_statements;

public class For_statement_challenge {
    public static void main(String[] args) {

        int primeNumberCount = 0;
        for (int i = 0; i < 108; i++) {
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
                primeNumberCount++;
                System.out.println("Prime numbers found: " + primeNumberCount);
                if (primeNumberCount == 3){
                    break;
                }
            }
        }
    }

    // Funkcja sprawdzająca, czy podana liczba jest liczbą pierwszą
    public static boolean isPrime (int n) {
        if ((n == 1) || (n == 0)){
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit
