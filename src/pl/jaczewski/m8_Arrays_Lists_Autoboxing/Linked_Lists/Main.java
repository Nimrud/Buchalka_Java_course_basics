package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Linked_Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> trip = new LinkedList<>();
        trip.add("Warszawa");
        trip.add("Płock");
        trip.add("Toruń");
        trip.add("Bydgoszcz");

        printList(trip);

        LinkedList<String> newTrip = new LinkedList<>();
        addInOrder(newTrip, "Warszawa");
        addInOrder(newTrip, "Poznań");
        addInOrder(newTrip, "Warszawa");
        addInOrder(newTrip, "Toruń");
        addInOrder(newTrip, "Bydgoszcz");
        printList(newTrip);
    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Visiting " + i.next());
        }
        System.out.println("------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()){
            // dopiero iterator.next() przechodzi do pierwszej pozycji na liście!
            int compare = iterator.next().compareTo(newCity);
            if (compare == 0){
                System.out.println(newCity + " is already in the list.");
                return false;
            } else if (compare > 0){
                iterator.previous(); // musimy się cofnąć indeks o 1, bo .next() już przeszło do kolejnej pozycji
                iterator.add(newCity);
                return true;
            }
        }
        iterator.add(newCity);
        return true;
    }
}
