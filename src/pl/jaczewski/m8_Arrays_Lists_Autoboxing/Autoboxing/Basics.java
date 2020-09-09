package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Autoboxing;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {

        Integer firstInteger = new Integer(22);
        Integer secondInteger = 24;      // skrócony zapis <= new Integer(24)
        int myInt = secondInteger;  // skrócony zapis <= secondInteger.intValue()

        ArrayList<Integer> newIntegerList = new ArrayList<>();
        for (int i = 0; i <= 5; i++){
            newIntegerList.add(i);
        //  newIntegerList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 5; i++){
            System.out.println(newIntegerList.get(i));
        //  System.out.println(newIntegerList.get(i).intValue());
        }

    }
}
