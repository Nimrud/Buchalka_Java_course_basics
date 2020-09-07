package pl.jaczewski.m8_Arrays_Lists_Autoboxing;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayLists_Java grocerylist = new ArrayLists_Java();

    public static void main(String[] args) {
        int inputNumber = 0;
        boolean quitApplication = false;
        printInstructions();
        while (!quitApplication){
            System.out.print("Enter a number from the menu (for options - press 0): ");
            inputNumber = sc.nextInt();
            sc.nextLine();

            switch (inputNumber){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocerylist.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    itemSearch();
                    break;
                case 6:
                    quitApplication = true;
                    break;
                default:
                    printInstructions();
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Menu (press a suitable number): ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Enter item name: ");
        grocerylist.addItem(sc.nextLine());
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int number = sc.nextInt();
        sc.nextLine();
        grocerylist.removeItem(number-1);
    }

    private static void modifyItem(){
        System.out.print("Enter item number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a replacement item name: ");
        String itemName = sc.nextLine();
        grocerylist.modifyItem(number-1, itemName);
    }

    private static void itemSearch(){
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        if (grocerylist.findItem(name) != null){
            System.out.println(name + " has been found on the list.");
        } else {
            System.out.println(name + " is not in the list.");
        }
    }
}
