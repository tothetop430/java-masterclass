package learning;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        Thread anotherThread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous thread.");
            }
        };

        anotherThread2.start();

        System.out.println("Hello again from the main thread.");
    }
}
