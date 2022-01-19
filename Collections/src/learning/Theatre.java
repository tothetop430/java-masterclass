package learning;

import java.util.*;

public class Theatre {

    private static class Seat implements Comparable<Seat> {
        private final String seatNum;
        private double price;
        private boolean reserved;
        public Seat(String seatNum, double price) {
            this.seatNum = seatNum;
            this.reserved = false;
            this.price = price;
        }

        public double getPrice() {
            return price;
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

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                return Double.compare(seat1.getPrice(), seat2.getPrice());
            }
        };
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row='A'; row<=lastRow; row++) {
            for (int seatNum=1; seatNum<=seatsPerRow; seatNum++) {
                double price = 12.0;
                if (row < 'D' && (seatNum>=4 && seatNum<=9)) price = 14.0;
                else if (row > 'F' || seatNum < 4 || seatNum > 9 ) price = 7.0;
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat toReserve = new Seat(seatNumber, 0);
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

    public Collection<Seat> getSeats() {
        return seats;
    }
}
