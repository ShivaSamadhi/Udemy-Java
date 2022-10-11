package src.GroceryApp;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.printf("You have %s items on your list%n", groceryList.size());
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.printf("%s. %s", i+1, groceryList.get(i));
        }
    }

    private void modifyGroceryItem (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.printf("Grocery item %s has been replace with %s%n", position+1, newItem);
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem (int position){
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private int findItem(String searchItem){
       return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
