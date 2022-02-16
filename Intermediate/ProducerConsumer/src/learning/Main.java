package learning;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_PURPLE + "Inside Callable Future");
                return ThreadColor.ANSI_PURPLE + "This is returned from Callable";
            }
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException | InterruptedException ignored) {}

        executorService.shutdown();
    }
}

class MyProducer implements Runnable {
    private final ArrayBlockingQueue<String> buffer;
    private final String color;
    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
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
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException ignored) {}

        System.out.println(color + "Adding EOF...");
        try {
            buffer.put("EOF");
        } catch (InterruptedException ignored) {}
    }
}

class MyConsumer implements Runnable {
    private final ArrayBlockingQueue<String> buffer;
    private final String color;
    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equalsIgnoreCase("EOF")) {
                        System.out.println(color + "Exiting Consumer...");
                        break;
                    } else {
                        System.out.println(color + "Reading... " + buffer.take());
                    }
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}
