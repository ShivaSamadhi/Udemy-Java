package src.GroceryApp;

import java.util.Scanner;

public class GroceryApp {
    //ArrayLists
    private static Scanner listScanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        //ArrayLists
        boolean quit = false;
        int choice = 0;
        String makeList;
        printInstructions();

        System.out.print("Would You Like To Make a Grocery List? y/n: ");
        makeList = listScanner.nextLine();

        if(makeList.equals("y")) {
            while (!quit){
                System.out.println("Enter your choice: ");
                choice = listScanner.nextInt();
                listScanner.nextLine();

                switch (choice) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        groceryList.printGroceryList();
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
                        searchItem();
                        break;
                    case 6:
                        quit = true;
                        break;
                }
            }
        }
        else {
            System.out.print("No problem. Maybe next time");
        }


    }


    public static void printInstructions() {
        System.out.printf("%nPress");
        System.out.printf("%n\t 0 - Print Choice Options.");
        System.out.printf("%n\t 1 - Print Grocery List Items.");
        System.out.printf("%n\t 2 - Add An Item To The List.");
        System.out.printf("%n\t 3 - Modify An Item On The List.");
        System.out.printf("%n\t 4 - Remove An Item On The List.");
        System.out.printf("%n\t 5 - Search For An Item On The List.");
        System.out.printf("%n\t 6 - Quit The App.%n");
    }

    public static void addItem(){
        System.out.print("Enter The Grocery Item: ");
        groceryList.addGroceryItem(listScanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter Grocery Item: ");
        String item = listScanner.nextLine();

        System.out.print("Enter Replacement Item: ");
        String newItem = listScanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }
    public static void removeItem(){
        System.out.print("Enter Grocery Item : ");
        String item = listScanner.nextLine();
        groceryList.removeGroceryItem(item);
    }
    public static void searchItem(){
        System.out.print("Enter Grocery Item: ");
        String searchFor = listScanner.nextLine();
        if (groceryList.onFile(searchFor)){
            System.out.printf("Found %s In The Grocery List", searchFor);
        }
        else{
            System.out.printf("%s Not Found In The Grocery List", searchFor);
        }
    }

}
