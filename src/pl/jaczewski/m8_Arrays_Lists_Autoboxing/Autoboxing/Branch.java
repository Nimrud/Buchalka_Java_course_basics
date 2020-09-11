package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Autoboxing;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> myCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.myCustomers = new ArrayList<>();
    }

    public int findCustomer(int pesel) {
        for (int i = 0; i < myCustomers.size(); i++) {
            if (myCustomers.get(i).getPesel() == pesel) {
                return i;
            }
        }
        return -1;
    }

    private int findCustomer(Customer customer) {
        return this.myCustomers.indexOf(customer);
    }

    public boolean isAlreadyCustomer(int pesel) {
        if (findCustomer(pesel) >= 0) {
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerName, int customerPesel, double initialAmount) {
        if (findCustomer(customerPesel) >= 0) {
            System.out.println("This customer already exists.");
            return false;
        } else {
            this.myCustomers.add(new Customer(customerName, customerPesel, initialAmount));
            System.out.println("Added customer to branch " + this.branchName + ".");
            return true;
        }
    }

    public boolean removeCustomer(Customer customer) {
        if (findCustomer(customer) >= 0) {
            System.out.println("The account of " + customer.getName() + " (PESEL: " + customer.getPesel() + ") was closed. Customer deleted from database.");
            this.myCustomers.remove(findCustomer(customer));
            return true;
        } else {
            System.out.println(customer.getName() + " (PESEL: " + customer.getPesel() + ") not found.");
            return false;
        }
    }

    public boolean updateCustomer(int pesel, String oldCustomerName, String newCustomerName) {
        if (findCustomer(pesel) < 0) {
            System.out.println("PESEL: " + pesel + " not found.");
            return false;
        } else {
            Customer updatedCustomer = findWholeCustomer(pesel).setName(newCustomerName);
            this.myCustomers.set(findCustomer(pesel), updatedCustomer);
            return true;
        }
    }
    private Customer findWholeCustomer(int pesel){
        for (int i = 0; i < myCustomers.size(); i++) {
            if (myCustomers.get(i).getPesel() == pesel) {
                return myCustomers.get(i);
            }
        }
        return null;
    }

    /*
    bez gettera, na piechotę:
        public void displayCustomers(){
            System.out.println(this.branchName + " has " + this.myCustomers.size() + "customers:");
            for (int i = 0; i < this.myCustomers.size(); i++){
                System.out.println("#" + (i+1) + ": " + this.myCustomers.get(i).getName() + " (PESEL: " + this.myCustomers.get(i).getPesel() + ").");
            }
        }
     */

    public ArrayList<Customer> getMyCustomers() {
        return myCustomers;
    }

    public boolean addTransaction(int pesel, double amount) {
        if (findCustomer(pesel) < 0) {
            System.out.println("Customer not found.");
            return false;
        } else {
            this.myCustomers.get(findCustomer(pesel)).addTransaction(amount);
            System.out.println("Balance for this account has been changed by " + amount);
            return true;
        }
    }

    public String getBranchName() {
        return branchName;
    }

    public Branch setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
}
