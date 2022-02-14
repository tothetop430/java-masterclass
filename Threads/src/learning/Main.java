package learning;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName(" == Another Thread == ");
        anotherThread.start();

//        new Thread() {
//            @Override
//            public void run() {
//                System.out.println("Hello from == " + currentThread().getName() + " == ");
//            }
//        }.start();

//        new Thread(() -> System.out.println("Hello from anonymous thread.")).start();

//        Thread runnableThread = new Thread(new MyRunnable());
//        runnableThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous runnable thread.");
                try {
                    anotherThread.join();
                    System.out.println("back to anonymous runnable.");
                } catch (InterruptedException e) {
                    System.out.println("Another thread interrupted back to anonymous runnable.");
                }
            }
        }).start();

        System.out.println("Hello again from the main thread.");
    }
}
