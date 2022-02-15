package learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}

class MyProducer implements Runnable {
    private final List<String> buffer;
    private final String color;
    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }
    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5", "6"};
        try {
            for (String num : nums) {
                System.out.println(color + "Adding... " + num);
                synchronized (buffer) {
                    buffer.add(num);
                }
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException ignored) {}

        System.out.println(color + "Adding EOF...");
        synchronized (buffer) {
            buffer.add("EOF");
        }
    }
}

//class MyConsumer implements Runnable {
//    private final List<String> buffer;
//    private final String color;
//    public MyConsumer(List<String> buffer, String color) {
//        this.buffer = buffer;
//        this.color = color;
//    }
//    @Override
//    public void run() {
//        while(true) {
//            synchronized (buffer) {
//                if (buffer.isEmpty()) {
//                    continue;
//                }
//                if (buffer.get(0).equalsIgnoreCase("EOF")) {
//                    System.out.println(color + "Exiting Consumer...");
//                    break;
//                } else {
//                    System.out.println(color + "Reading... " + buffer.remove(0));
//                }
//            }
//        }
//    }
//}