package learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        ReentrantLock bufferLock = new ReentrantLock();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN, bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}

class MyProducer implements Runnable {
    private final List<String> buffer;
    private final String color;
    private final ReentrantLock lock;
    public MyProducer(List<String> buffer, String color, ReentrantLock lock) {
        this.buffer = buffer;
        this.color = color;
        this.lock = lock;
    }
    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5", "6"};
        try {
            for (String num : nums) {
                System.out.println(color + "Adding... " + num);
                this.lock.lock();
                buffer.add(num);
                this.lock.unlock();

                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException ignored) {}

        System.out.println(color + "Adding EOF...");
        this.lock.lock();
        buffer.add("EOF");
        this.lock.unlock();
    }
}

class MyConsumer implements Runnable {
    private final List<String> buffer;
    private final String color;
    private final ReentrantLock lock;
    public MyConsumer(List<String> buffer, String color, ReentrantLock lock) {
        this.buffer = buffer;
        this.color = color;
        this.lock = lock;
    }
    @Override
    public void run() {
        while(true) {
            this.lock.lock();
            if (buffer.isEmpty()) {
                this.lock.unlock();
                continue;
            }
            if (buffer.get(0).equalsIgnoreCase("EOF")) {
                System.out.println(color + "Exiting Consumer...");
                this.lock.unlock();
                break;
            } else {
                System.out.println(color + "Reading... " + buffer.remove(0));
            }
            this.lock.unlock();
        }
    }
}