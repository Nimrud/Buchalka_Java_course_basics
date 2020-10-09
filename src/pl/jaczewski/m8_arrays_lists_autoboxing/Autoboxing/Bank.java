package pl.jaczewski.m8_arrays_lists_autoboxing.Autoboxing;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> myBranches;
    private String bankName;

    public Bank (String bankName) {
        this.myBranches = new ArrayList<>();
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    private Branch findBranch(String name){
        for (int i = 0; i < myBranches.size(); i++){
            if (myBranches.get(i).getBranchName().equals(name)){
                return myBranches.get(i);
            }
        }
        return null;
    }
    private int findBranchIndex(Branch branch){
        return myBranches.indexOf(branch);
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            myBranches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " added.");
            return true;
        } else {
            System.out.println("Branch of this name already exists.");
            return false;
        }
    }

    public boolean updateBranch(String oldBranchName, String newBranchName){
        Branch oldBranch = findBranch(oldBranchName);
        if (oldBranch == null){
            System.out.println("Branch " + oldBranchName + " not found.");
            return false;
        } else {
            Branch branchNewName = oldBranch.setBranchName(newBranchName);
            myBranches.set(findBranchIndex(oldBranch), branchNewName);
            System.out.println("Branch " + oldBranchName + " updated with name: " + newBranchName);
            return true;
        }
    }

    public boolean addCustomerToBranch(String branchName, String customerName, int pesel, double amount){
        Branch branch = findBranch(branchName);
        if (branch == null){
            System.out.println("Incorrect branch name.");
            return false;
        } else {
            branch.addCustomer(customerName, pesel, amount);
            System.out.println("New customer added (" + customerName + ", PESEL: " + pesel + ", initial amount: " + amount + ").");
            return true;
        }
    }

    public void displayCustomersOfBranch(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch == null){
            System.out.println("Invalid branch name.");
        } else {
            ArrayList<Customer> branchCustomers = branch.getMyCustomers();

            for (int i = 0; i < branchCustomers.size(); i++){
                Customer brCustomer = branchCustomers.get(i);
                System.out.println("#" + (i+1) + ": " + brCustomer.getName() + " (PESEL: " + brCustomer.getPesel() + ").");

                if (showTransactions){
                    System.out.println("Customer transactions:");
                    ArrayList<Double> customerTransactions = brCustomer.getTransactions();
                    for (int j = 0; j < customerTransactions.size(); j++){
                        System.out.println((j+1) + ": " + customerTransactions.get(j));
                    }
                 }
            }
        }
    }

    public boolean addCustomerTransaction(String branchName, int pesel, double amount){
        Branch branch = findBranch(branchName);
        if (branch == null){
            System.out.println("Incorrect branch name.");
            return false;
        } else {
            branch.addTransaction(pesel, amount);
            System.out.println("Customer account (" + pesel + ") modified by: " + amount);
            return true;
        }
    }

    public void displayBranches(){
        System.out.println(this.bankName + " has " + myBranches.size() + " branches.");
        for (int i = 0; i < myBranches.size(); i++){
            System.out.println("#" + (i+1) + ": " + myBranches.get(i).getBranchName());
        }
    }

    public void customerFinder(String branchName, int pesel){
        Branch branch = findBranch(branchName);
        if (branch != null){
            if (branch.isAlreadyCustomer(pesel)){
                System.out.println("Customer already in database");
            } else {
                System.out.println("PESEL number not found.");
            }
        } else {
            System.out.println("Invalid branch name.");
        }

    }

    public void customerUpdater(String branchName, int pesel, String oldName, String newName){
        Branch branch = findBranch(branchName);
        if (branch != null){
            if (branch.updateCustomer(pesel, oldName, newName)){
                System.out.println("Customer name updated to: " + newName);
            } else {
                System.out.println("PESEL number not found.");
            }
        } else {
            System.out.println("Invalid branch name.");
        }

    }
}
