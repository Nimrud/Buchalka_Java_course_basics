package pl.jaczewski.m5_control_flow_statements;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class For_statement {

    public static void main(String[] args) {

        // Do kalkulacji finansowych powinien zostać użyty typ BigDecimal, ale tu - zgodnie z poleceniem użyłem double
        for (int i = 2; i <= 8; i++) {
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000, i));
            // Dziwnych części "po przecinku" double'a można się pozbyć używając  String.format("%.2f",double), np.
            // String.format("%.2f",calculateInterest(10000, i))
        }

        // Z użyciem BigDecimal - praca własna
        System.out.println("Z użyciem BigDecimal:");
        BigDecimal money = new BigDecimal("10000");
        BigDecimal start = BigDecimal.valueOf(2);
        BigDecimal end = BigDecimal.valueOf(8);
        for(BigDecimal i = start; i.compareTo(end) <= 0; i = i.add(BigDecimal.ONE)){
            System.out.println("10000 at " + i + "% = " + calculateInterestBD(money, i));
        }
    }

    public static double calculateInterest (double money, double interestRate) {
        return (money * (interestRate/100));
    }

    // Z użyciem BigDecimal - praca własna
    public static BigDecimal calculateInterestBD (BigDecimal money, BigDecimal interestRate) {
        BigDecimal hundred = new BigDecimal("100");
        return (money.multiply(interestRate.divide(hundred, 2, RoundingMode.HALF_UP)));
    }
}
