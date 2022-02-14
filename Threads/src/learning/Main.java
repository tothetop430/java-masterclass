package learning;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous thread.");
            }
        }.start();

//        new Thread(() -> System.out.println("Hello from anonymous thread.")).start();

        System.out.println("Hello again from the main thread.");
    }
}
