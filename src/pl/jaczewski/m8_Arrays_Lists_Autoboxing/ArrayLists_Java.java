package pl.jaczewski.m8_Arrays_Lists_Autoboxing;

import java.util.ArrayList;

public class ArrayLists_Java {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
        System.out.println(item + " has been added.");
    }

    private void removeItem(int position){
        String itemRemoved = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(itemRemoved + " has been removed.");
    }
    public void removeItem(String item){
        int position = findItem(item);
        if (position >=0){
        removeItem(groceryList.indexOf(item));
        } else {
            System.out.println("This item is not in the list.");
        }
    }

    private void modifyItem(int position, String name){
        groceryList.set(position, name);
        System.out.println("Item #" + (position+1) + " has been replaced with " + name + ".");
    }
    public void modifyItem(String oldItem, String newItem){
        int position = findItem(oldItem);
        if (position >= 0){
            modifyItem(position, newItem);
        } else {
            System.out.println("No such an item in the list.");
        }
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items on your list.");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println("Item #" + (i+1) + " is " + groceryList.get(i));
        }
    }

    public int findItem(String item){
        return groceryList.indexOf(item);
        // boolean exists = groceryList.contains(item);

        /*
        // Metoda zwracająca Stringa:
        int position = groceryList.indexOf(item);
        if (position >= 0){
            return groceryList.get(position);
        } else {
            return null;
        }
         */
    }
}
