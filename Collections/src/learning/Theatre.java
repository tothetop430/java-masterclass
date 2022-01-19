package learning;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private static class Seat {
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
        Seat reservedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNum().equals(seatNumber)) {
                reservedSeat = seat;
                break;
            }
        }

        if (reservedSeat == null) {
            System.out.println("Can not find seat "+ seatNumber + " to reserve");
            return false;
        }
        return reservedSeat.reserve();
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
