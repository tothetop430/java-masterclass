package learning;

import java.util.*;

public class Theatre {

    private static class Seat implements Comparable<Seat> {
        private final String seatNum;
        private boolean reserved;
        public Seat(String seatNum) {
            this.seatNum = seatNum;
            this.reserved = false;
        }

        public String getSeatNum() {
            return seatNum;
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Reserving Seat " + seatNum);
                return true;
            }
            else {
                System.out.println(this.seatNum + " is already reserved.");
                return false;
            }
        }

        public boolean cancel() {
            if (reserved) {
                System.out.println("Cancelling Seat " + seatNum);
                reserved = false;
                return true;
            }
            else {
                System.out.println("Cannot Cancel an Unreserved Seat " + seatNum);
                return false;
            }

        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNum.compareToIgnoreCase(seat.seatNum);
        }
    }

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row='A'; row<=lastRow; row++) {
            for (int seatNum=1; seatNum<=seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat toReserve = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, toReserve, null);
        if (foundSeat >= 0) return toReserve.reserve();
        else {
            System.out.println("Can not find seat "+ seatNumber + " to reserve");
            return false;
        }
    }

    public boolean cancelSeat(String seatNumber) {
        for (Seat seat: seats) {
            if (seat.getSeatNum().equals(seatNumber)) {
                return seat.cancel();
            }
        }
        System.out.println("There is no seat " + seatNumber + " in theatre");
        return false;
    }

    public void getSeats() {
        for (Seat seat: seats) {
            System.out.println("Seat -> " + seat.getSeatNum());
        }
    }
}
