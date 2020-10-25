package pl.jaczewski.m12_collections.binary_search_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Powszechny", 11, 12);
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

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.getSeats());
        //Collections.reverse(seatCopy);   // zwraca elementy listy w porządku odwróconym
        //Collections.shuffle(seatCopy);   // zwraca elementy listy (nieuporządkowane)
        //Collections.min(seatCopy);       // zwraca najmniejszy element, zgodnie z użytą metodą sortowania
        //Theatre.Seat maxSeat = Collections.max(seatCopy);
        //System.out.println(maxSeat.getSeatNumber());

        printList(seatCopy);

        // wykorzystanie komparatora:
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 10.50));
        priceSeats.add(theatre.new Seat("A00", 25.99));
        priceSeats.add(theatre.new Seat("D00", 5.99));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list){
        System.out.println("==============");
        for (Theatre.Seat seat: list){
            System.out.print(seat.getSeatNumber() + " ($" + seat.getPrice() + "), ");
        }
        System.out.println();
        System.out.println("==============");
    }
}
