package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Autoboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int pesel;
    private double initialAmount;
    private ArrayList<Double> transactions;

    public Customer(String name, int pesel, double initialAmount) {
        this.name = name;
        this.pesel = pesel;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public int getPesel() {
        return pesel;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public Customer createCustomer(String name, int pesel, double initialAmount){
        return new Customer(name, pesel, initialAmount);
    }
}
