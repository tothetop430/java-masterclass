package learning;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Another thread woke me up.");
            return;
        }

        System.out.println("5 Seconds have passed.");

    }
}
