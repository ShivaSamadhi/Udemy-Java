package src.ContactManager;

import java.util.Scanner;

public class ContactManager {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone cellPhone = new MobilePhone("4693891347");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

        while(!quit){
            System.out.printf("%nEnter Action: (Press 6 to show Action List)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("%nShutting Down.");
                    quit = true;
                    break;
                case 1:
                    cellPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                case 6:
                    printActions();
                    break;

            }
        }

    }
    private static void addNewContact(){
        System.out.println("Enter New Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(cellPhone.addNewContact(newContact)){
            System.out.printf("New Contact Added: %s - %s", name, phone);
        }
        else {
            System.out.printf("Cannot add, %s is already on file", name);
        }
    }
    private static void updateContact(){
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = cellPhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact Not Found");
            return;
        }
        System.out.print("Enter New Contact Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter New Contact Phone Number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(cellPhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully Updated Contact");
        }
        else{
            System.out.println("Unable To Update Contact");
        }
    }
    private static void removeContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = cellPhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact Not Found");
            return;
        }
        if (cellPhone.removeContact(existingContact))
    }
    public static void startPhone(){
        System.out.printf("Starting phone...");
    }
    public static void printActions(){
        System.out.printf("%nAvailable Actions: %npress");
        System.out.printf("0 - Shutdown%n" +
                "1 - Print Contacts%n" +
                "2 - Add New Contact%n" +
                "3 - Update Existing Contact%n" +
                "4 - Remove Existing Contact%n" +
                "5 - Validate If Contact Exists%n" +
                "6 - Print List Of Actions");
        System.out.println("Choose Your Action: ");
    }
}
