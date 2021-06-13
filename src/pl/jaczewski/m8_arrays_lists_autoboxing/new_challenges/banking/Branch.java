package pl.jaczewski.m8_arrays_lists_autoboxing.new_challenges.banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        //TODO
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        //TODO
    }

    private Customer findCustomer(String customerName) {
        //TODO
    }
}
