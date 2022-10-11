package src.ContactManager;

import java.util.Scanner;

public class ContactManager {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("4693891347");

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
                    phone.printContacts();
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
