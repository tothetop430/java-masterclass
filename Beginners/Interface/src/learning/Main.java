package learning;

public class Main {

    public static void main(String[] args) {
	    ITelephone myTelephone;
        myTelephone = new DeskPhone(999999, "DeskPhone");
        myTelephone.powerOn();
        myTelephone.incomingCall();
        myTelephone.outgoingCall(191191);
    }
}
