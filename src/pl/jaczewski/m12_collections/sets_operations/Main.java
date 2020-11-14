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

        // Asymmetric difference - coś występuje w jednym Secie, ale nie występuje w drugim:
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"nature", "unknown", "art", "all", "is"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"divine", "forgive", "human", "is"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine-nature:");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        // Symmetric difference - coś występuje w jednym Secie albo drugim (ale nie występuje w obu naraz!)
        Set<String> newUnion = new HashSet<>(divine);
        newUnion.addAll(nature);

        // ustalamy elementy wspólne dla obu Setów:
        Set<String> newIntersection = new HashSet<>(divine);
        newIntersection.retainAll(nature);
//        System.out.println("New Intersection:");
//        printSet(newIntersection);
        newUnion.removeAll(newIntersection);
        System.out.println("Symmetric difference:");
        printSet(newUnion);

        // containsAll() - zwraca wartość true/false
        if (divine.containsAll(nature)){
            System.out.println("Nature is a subset of Divine");
        }

        if (divine.containsAll(newIntersection)){
            System.out.println("Intersection is a subset of Divine");
        }

    }

    private static void printSet(Set<String> set){
        System.out.print("\t");
        for (String s : set){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
