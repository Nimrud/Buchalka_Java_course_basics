package pl.jaczewski.m12_collections.binary_search;

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
    }
}
