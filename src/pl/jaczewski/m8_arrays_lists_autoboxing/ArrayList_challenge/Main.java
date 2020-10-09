package pl.jaczewski.m8_arrays_lists_autoboxing.ArrayList_challenge;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("222-333-444");
    public static void main(String[] args) {
        int numberChosen = 0;
        boolean quit = false;
        printInstructions();
        while (!quit){
            System.out.print("Please select an option (0 for instructions): ");

            boolean isInt = sc.hasNextInt();
            if (!isInt){
                System.out.println("Invalid number. Try again.");
                sc.nextLine();
            } else {
                numberChosen = sc.nextInt();
                sc.nextLine();

                switch (numberChosen){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        myPhone.displayContacts();
                        break;
                    case 2:
                        addContact();
                        break;
                    case 3:
                        modifyContact();
                        break;
                    case 4:
                        deleteContact();
                        break;
                    case 5:
                        findContact();
                        break;
                    case 6:
                        System.out.println("Shutting down...");
                        quit = true;
                        break;
                    default:
                        printInstructions();
                        break;
                }
            }
        }
    }

    public static void addContact(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        myPhone.addContact(Contacts.createContact(name, phoneNumber));
    }

    public static void modifyContact(){
        System.out.print("Enter a name to modify: ");
        String oldName = sc.nextLine();
        Contacts oldContact = myPhone.existingContact(oldName);
        if (oldContact == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter a modified name: ");
        String newName = sc.nextLine();
        System.out.print("Enter a modified phone number: ");
        String newPhoneNumber = sc.nextLine();
        Contacts modifiedContact = Contacts.createContact(newName, newPhoneNumber);

        myPhone.updateContact(oldContact, modifiedContact);
    }

    public static void deleteContact(){
        System.out.print("Enter a name to delete: ");
        String name = sc.nextLine();
        Contacts contact = myPhone.existingContact(name);
        if (contact == null){
            System.out.println("Contact not found.");
            return;
        }
        myPhone.removeContact(contact);
    }

    public static void findContact(){
        System.out.print("Enter the name you are looking for: ");
        String name = sc.nextLine();
        Contacts contact = myPhone.existingContact(name);
        if (contact != null){
            System.out.println(name + " - phone number is: " + contact.getPhoneNumber());
        } else {
            System.out.println("You don't have " + name + " in your contacts.");
        }
    }

    public static void printInstructions() {
        System.out.println("Menu (press a suitable number): ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contacts list.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }
}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// MobilePhone should do everything with Contact objects only.