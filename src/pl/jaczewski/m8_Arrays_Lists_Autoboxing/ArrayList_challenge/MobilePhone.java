package pl.jaczewski.m8_Arrays_Lists_Autoboxing.ArrayList_challenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myPhoneNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("This person is already in this contacts list. No changes made.");
            return false;
        } else {
            myContacts.add(contact);
            System.out.println("New contact added (" + contact.getName() + ", phone: " + contact.getPhoneNumber() + ").");
            return true;
        }
    }

    public boolean removeContact(Contacts contact){
        if (findContact(contact) >= 0){
            System.out.println(contact.getName() + " was deleted.");
            this.myContacts.remove(findContact(contact));
            return true;
        }
        System.out.println(contact.getName() + " was not found.");
        return false;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int positionFound = findContact(oldContact);
        if (positionFound < 0){
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists.\n" +
                    "Update was not performed.");
            return false;
        }
        this.myContacts.set(positionFound, newContact);
        System.out.println(oldContact.getName() + " was updated with " + newContact.getName());
        return true;


    }

    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for (int i = 0; i < this.myContacts.size(); i++){
            if (myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean existingContact(Contacts contact){
        if (findContact(contact) >= 0){
            return true;
        }
        return false;
    }
    public Contacts existingContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void displayContacts(){
        System.out.println("You have " + this.myContacts.size() + " contacts in your list.");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println("#" + (i+1) + ": " + this.myContacts.get(i).getName()
                                    + ", phone: " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
