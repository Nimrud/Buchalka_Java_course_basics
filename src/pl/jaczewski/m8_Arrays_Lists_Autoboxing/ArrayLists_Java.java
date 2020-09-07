package pl.jaczewski.m8_Arrays_Lists_Autoboxing;

import java.util.ArrayList;

public class ArrayLists_Java {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
        System.out.println(item + " has been added.");
    }

    public void removeItem(int position){
        String itemRemoved = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(itemRemoved + " has been removed.");
    }

    public void modifyItem(int position, String name){
        groceryList.set(position, name);
        System.out.println("Item #" + position + " has been replaced with " + name + ".");
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items on your list.");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println("Item #" + (i+1) + " is " + groceryList.get(i));
        }
    }

    public String findItem(String item){
        // boolean exists = groceryList.contains(item);
        int position = groceryList.indexOf(item);
        if (position >= 0){
            return groceryList.get(position);
        } else {
            return null;
        }
    }
}
