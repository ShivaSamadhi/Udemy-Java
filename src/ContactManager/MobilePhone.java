package src.ContactManager;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    
    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0) {
            System.out.printf("%nContact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.printf("%s was not found%n", oldContact.getName());
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.printf("Contact With Name %s Already Exists. Update Unsuccessful.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.printf("%s was updated to %s", oldContact.getName(), newContact.getName());
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
       int position = findContact(name);
       if(position >= 0){
           return this.myContacts.get(position);
       }
       return null;
    }

    public boolean removeContact (Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.printf("%s was not found", contact.getName());
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.printf("%s was deleted", contact.getName());
        return true;
    }
    public void printContacts(){
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.printf("%s. %s -> %s%n", i+1, this.myContacts.get(i).getName(), this.myContacts.get(i).getPhoneNumber());
        }
    }






















}
