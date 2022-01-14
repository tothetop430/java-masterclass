package learning;

public class DeskPhone implements ITelephone {

    private int number;
    private String phoneName;

    public DeskPhone(int number, String phoneName) {
        this.number = number;
        this.phoneName = phoneName;
    }

    @Override
    public void powerOn() {
        System.out.println("Powering On The Phone " + phoneName);
    }

    @Override
    public void incomingCall() {
        System.out.println("Calling on " + number + ", Phone is ringing...");
    }

    @Override
    public void outgoingCall(int number) {
        System.out.println("Dialing call to " + number + " from " + this.number +
                " using phone " + phoneName);
    }

}
