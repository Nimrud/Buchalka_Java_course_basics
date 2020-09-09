package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Autoboxing;

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

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            System.out.println("Branch of this name already exists.");
            return false;
        } else {
            myBranches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " added.");
            return true;
        }
    }

    public boolean removeBranch(Branch branch){
        if (findBranch(branch.getBranchName()) == null){
            System.out.println("Branch " + branch.getBranchName() + " not found.");
            return false;
        } else {
            myBranches.remove(findBranch(branch.getBranchName()));
            System.out.println("Branch " + branch.getBranchName() + " removed.");
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
}
