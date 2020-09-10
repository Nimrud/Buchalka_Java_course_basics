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
    private int findBranchIndex(Branch branch){
        return myBranches.indexOf(branch);
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

    public boolean updateBranch(String oldBranchName, String newBranchName){
        Branch oldBranch = findBranch(oldBranchName);
        if (oldBranch == null){
            System.out.println("Branch " + oldBranch + " not found.");
            return false;
        } else {
            myBranches.set(findBranchIndex(oldBranch), findBranch(newBranchName));
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

    public void displayBranches(){
        for (int i = 0; i < myBranches.size(); i++){
            System.out.println("#" + (i+1) + ": " + myBranches.get(i).getBranchName());
        }
    }
}
