package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Autoboxing;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Bank bank = new Bank("Noble Bank");

    public static void main(String[] args) {
        System.out.println("Welcome to " + bank.getBankName() + "!\n"
                            + "Please choose your option:");
        int option;
        boolean quit = false;
        printInstructions();

        while(quit){
            boolean isInt = sc.hasNextInt();
            if (!isInt){
                System.out.println("Invalid number. Try again.");
                sc.nextLine();
            } else {
                option = sc.nextInt();
                sc.nextLine();

                switch (option){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        displayBranches();
                        break;
                    case 2:
                        addNewBranch();
                        break;
                    case 3:
                        modifyBranch();
                        break;
                    case 4:
                        addCustomer();
                        break;
                    case 5:
                        addTransaction();
                        break;
                    case 6:
                        displayCustomersOfBranch();
                        break;
                    case 7:
                        displayTransactionsOfBranch();
                        break;
                    case 8:
                        modifyCustomerData();
                        break;
                    case 9:
                        removeCustomer();
                        break;
                    case 10:
                        findCustomer();
                        break;
                    case 11:
                        quit = true;
                        break;
                    default:
                        printInstructions();
                        break;
                }
            }
        }

    }


    public static void addCustomer(){
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter PESEL number: ");
        int pesel = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter customer's deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter branch name: ");
        String branchName = sc.nextLine();
        bank.addCustomerToBranch(branchName, customerName, pesel, amount);
    }

    public static void displayBranches(){
        bank.displayBranches();
    }

    public static void addNewBranch(){
        System.out.print("Enter a name of the new branch: ");
        String branchName = sc.nextLine();
        bank.addBranch(branchName);
    }

    public static void modifyBranch(){
        System.out.print("Enter an existing branch name: ");
        String oldName = sc.nextLine();
        System.out.print("Enter new branch name: ");
        String newName = sc.nextLine();
        bank.updateBranch(oldName, newName);
    }

    public static void findCustomer(){

    }

    public static void printInstructions() {
        System.out.println("Menu: ");
        System.out.println("\t 0 - To display options.");
        System.out.println("\t 1 - To display bank branches.");
        System.out.println("\t 2 - To add a new branch.");
        System.out.println("\t 3 - To modify an existing branch.");
        System.out.println("\t 4 - To add a new customer to a branch.");
        System.out.println("\t 5 - To add a transaction for a customer.");
        System.out.println("\t 6 - To display all customers of a branch.");
        System.out.println("\t 7 - To display all transactions of customers of particular branch.");
        System.out.println("\t 8 - To modify customer data.");
        System.out.println("\t 9 - To remove a customer.");
        System.out.println("\t 10 - To search for a customer.");
        System.out.println("\t 11 - To quit the application.");
    }
}

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
// Keep it simple - no need to add last name or address of a customer