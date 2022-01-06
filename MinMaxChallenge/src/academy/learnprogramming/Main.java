package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter New Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                max = Math.max(number, max);
                min = Math.min(number, min);
            }
            else {
                System.out.println("Invalid Number, Exiting the Loop...");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum Number Found: " + min);
        System.out.println("Maximum Number Found: " + max);
        scanner.close();
    }
}
