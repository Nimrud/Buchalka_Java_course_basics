package pl.jaczewski.m12_collections.binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Powszechny", 11, 15);
        theatre.getSeats();
        System.out.println("========");

        if (theatre.reserveSeat("C08")){
            System.out.println("Please pay for the ticket");
        } else {
            System.out.println("Sorry, seat already taken");
        }

        if (theatre.reserveSeat("C08")){
            System.out.println("Please pay for the ticket");
        } else {
            System.out.println("Sorry, seat already taken");
        }

        List<Theatre> seatCopy = new ArrayList<>();
        Collections.reverse(seatCopy);     // zwraca elementy listy w porządku odwróconym
        Collections.shuffle(seatCopy);     // zwraca elementy listy (nieuporządkowane)
        //Collections.min(seatCopy);       // zwraca najmniejszy element, zgodnie z użytą metodą sortowania
    }
}
