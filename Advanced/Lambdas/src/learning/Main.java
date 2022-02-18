package learning;

public class Main {

    public static void main(String[] args) {
        new Thread(new CodeToRun()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from Runnable");
            }
        }).start();

        new Thread(() -> System.out.println("Printing from Lambda Runnable")).start();

        new Thread(() -> {
            System.out.println("Multiple lines in a lambda call");
            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Line 3");
        }).start();
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from CodeToRun");
    }
}
