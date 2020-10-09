package pl.jaczewski.m8_arrays_lists_autoboxing.Autoboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int pesel;
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

    public Customer setName(String name) {
        this.name = name;
        return this;
    }
}
