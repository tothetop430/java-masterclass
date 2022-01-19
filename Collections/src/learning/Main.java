package learning;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Good", 8, 12);
        theatre.getSeats();

        theatre.reserveSeat("H11");
        theatre.reserveSeat("H12");
        theatre.reserveSeat("H10");

        theatre.reserveSeat("H13");
        theatre.reserveSeat("H10");

        theatre.cancelSeat("H10");
        theatre.reserveSeat("H10");
    }
}
