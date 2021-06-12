package pl.jaczewski.m8_arrays_lists_autoboxing.new_challenges.mobile_phone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact) >= 0) {
            myContacts.remove(oldContact);
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i) == contact) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (findContact(name) >= 0) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName()
                                + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
