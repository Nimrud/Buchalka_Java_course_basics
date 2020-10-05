package pl.jaczewski.m10_Java_Generics;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(0);
        items.add(20);
        items.add(3);
        items.add(-14);

        printNumbers(items);
    }

    public static void printNumbers(ArrayList<Integer> items){
        for (Object i: items) {
            System.out.println((Integer) i * 2);
        }
    }
}
