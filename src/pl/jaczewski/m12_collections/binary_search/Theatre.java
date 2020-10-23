package pl.jaczewski.m12_collections.binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        // binarySearch() jest dużo bardziej efektywne niż przeszukiwanie wszystkich elementów pętlą for
        // (dzieli listę na pół i sprawdza, czy szukany element jest w tej połówce, następnie znów na pół itd.)
        // ale wymaga zastosowania interfejsu Comparable
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("Thre is no seat " + seatNumber);
            return false;
        }

//        for(Seat seat: seats){
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if (requestedSeat == null){
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
//        return requestedSeat.reserve();
    }

    // dla przetestowania poprawności kodu:
    public void getSeats(){
        for (Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " already taken");
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved = false;
                System.out.println("Booking of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
