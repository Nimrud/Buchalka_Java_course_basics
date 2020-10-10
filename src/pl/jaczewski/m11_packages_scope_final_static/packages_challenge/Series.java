package pl.jaczewski.m11_packages_scope_final_static.packages_challenge;

public class Series {

    public int nSum(int n){
        int sum = 0;
        for(int i=1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public int factorial(int n){
        int factorial = 1;
        for (int i=1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public int fibonacci(int n){
        if ((n == 0) || (n == 1)){
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
