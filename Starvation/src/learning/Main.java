package learning;

public class Main {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_CYAN));
        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLUE));
        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN));
        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_PURPLE));
        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_RED));

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static class Worker implements Runnable {
        private int runCount = 0;
        private final String color;

        public Worker(String color) {
            this.color = color;
        }

        @Override
        public void run() {
            for(int i=0; i<100; i++) {
                synchronized (lock) {
                    System.out.format(color + "%s runCount: %d\n", Thread.currentThread().getName(), this.runCount++);
                }
            }
        }
    }
}
