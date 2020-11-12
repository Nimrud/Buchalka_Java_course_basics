package pl.jaczewski.m12_collections.sets_operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++){
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");

//        for (Integer square : squares){
//            System.out.println(square);
//        }

        Set<Integer> union = new HashSet<>(squares);  // tworzymy nowy Set i dodajemy do niego wszystkie kwadraty
        union.addAll(cubes);                          // dodajemy do Seta union wszystkie sześciany
        System.out.println("Union has " + union.size() + " elements");   // nie ma tu 200 elementów, bo w Setach nie ma duplikatów!

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements:");
        for (int i : intersection){
            System.out.println(i + " (square of " + Math.sqrt(i) + " and cube of " + Math.cbrt(i) + ")");
        }
        System.out.println("=========");

        Set<String> words = new HashSet<>();
        String sentence = "szła dzieweczka do laseczka";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words){
            System.out.println(s);
        }
    }
}
