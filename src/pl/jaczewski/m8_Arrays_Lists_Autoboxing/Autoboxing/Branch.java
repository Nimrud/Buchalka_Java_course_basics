package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Autoboxing;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> myCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.myCustomers = new ArrayList<>();
    }

    private int findCustomer(int pesel){
        for (int i = 0; i < myCustomers.size(); i++){
            if (myCustomers.get(i).getPesel() == pesel){
                return i;
            }
        }
        return -1;
    }
    private int findCustomer(Customer customer){
        return this.myCustomers.indexOf(customer);
    }
    public boolean isAlreadyCustomer(int pesel){
        if (findCustomer(pesel) >= 0){
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerName, int customerPesel, double initialAmount){
        if (findCustomer(customerPesel) >= 0){
            System.out.println("This customer already exists.");
            return false;
        } else {
            this.myCustomers.add(new Customer(customerName, customerPesel, initialAmount));
            System.out.println("New customer added (" + customerName + ", PESEL: " + customerPesel + ", initial amount: " + initialAmount + ").");
            return true;
        }
    }

    public boolean removeCustomer(Customer customer){
        if (findCustomer(customer) >= 0){
            System.out.println("The account of " + customer.getName() + " (PESEL: " + customer.getPesel() + ") was closed. Customer deleted from database.");
            this.myCustomers.remove(findCustomer(customer));
            return true;
        } else {
            System.out.println(customer.getName() + " (PESEL: " + customer.getPesel() + ") not found.");
            return false;
        }
    }

    public boolean updateCustomer(Customer oldCustomerName, Customer newCustomerName){
        if (findCustomer(oldCustomerName) < 0){
            System.out.println(oldCustomerName.getName() + " (PESEL: " + oldCustomerName.getPesel() + ") not found.");
            return false;
        } else if (findCustomer(newCustomerName.getPesel()) != findCustomer(oldCustomerName.getPesel())){
            System.out.println("PESEL number must be the same.");
            return false;
        } else {
            this.myCustomers.set(findCustomer(oldCustomerName), newCustomerName);
            System.out.println(oldCustomerName.getName() + " has been replaced with " + newCustomerName.getName());
            return true;
        }
    }

    public void displayCustomers(){
        System.out.println(this.branchName + " has " + this.myCustomers.size() + "customers:");
        for (int i = 0; i < this.myCustomers.size(); i++){
            System.out.println("#" + (i+1) + ": " + this.myCustomers.get(i).getName() + " (PESEL: " + this.myCustomers.get(i).getPesel() + ").");
        }
    }

    public boolean addTransaction(Customer customer, double amount){
        if (findCustomer(customer.getPesel()) < 0) {
            System.out.println("Customer not found.");
            return false;
        } else {
            this.myCustomers.get(findCustomer(customer.getPesel())).addTransaction(amount);
            System.out.println("Balance for this account has been changed by " + amount);
            return true;
        }
    }

    public String getBranchName() {
        return branchName;
    }
}
