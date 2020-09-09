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

    }


    public static void addCustomer(){

    }

    public static void printInstructions() {
        System.out.println("Menu: ");
        System.out.println("\t 0 - To display options.");
        System.out.println("\t 1 - To display bank branches.");
        System.out.println("\t 2 - To modify an existing branch.");
        System.out.println("\t 3 - To add a new customer to a branch.");
        System.out.println("\t 4 - To add a transaction for a customer.");
        System.out.println("\t 5 - To display all customers of a branch.");
        System.out.println("\t 6 - To display all transactions of customers of particular branch.");
        System.out.println("\t 7 - To modify customer data.");
        System.out.println("\t 8 - To remove a customer.");
        System.out.println("\t 9 - To search for a customer.");
        System.out.println("\t 10 - To quit the application.");
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