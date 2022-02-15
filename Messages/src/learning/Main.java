package learning;

import java.io.Reader;
import java.io.Writer;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        empty = true;
        notifyAll();
        return this.message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        this.message = message;
        empty = false;
        notifyAll();
    }
}

//class Writer implements Runnable {
//    private Message message;
//    public Writer(Message message) {
//        this.message = message;
//    }
//    @Override
//    public void run() {
//        String[] messages = {
//                "String 1",
//                "String 2",
//                "String 3",
//                "String 4"
//        };
//        Random random = new Random();
//        for (String mess : messages) {
//            this.message.write(mess);
//            try {
//                Thread.sleep(random.nextInt(2000));
//            } catch (InterruptedException ignored) {
//
//            }
//        }
//        this.message.write("Finished");
//    }
//}

//class Reader implements Runnable {
//    private Message message;
//    public Reader(Message message) {
//        this.message = message;
//    }
//    @Override
//    public void run() {
//        Random random = new Random();
//        for (String latMessage = this.message.read(); !latMessage.equalsIgnoreCase("Finished");
//            latMessage = this.message.read()) {
//            System.out.println("Message Consumed " + latMessage);
//            try {
//                Thread.sleep(random.nextInt(2000));
//            } catch (InterruptedException ignored) {}
//        }
//    }
//}
