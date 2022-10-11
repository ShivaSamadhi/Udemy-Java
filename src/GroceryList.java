package src;

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

    public void modifyGroceryItem (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.printf("Grocery item %s has been replace with %s%n", position+1, newItem);
    }

    public void removeGroceryItem (int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.printf("%s at position %s has been removed", item, position+1);
    }

    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
