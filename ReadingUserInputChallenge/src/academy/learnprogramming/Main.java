package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count < 11) {
            System.out.print("Enter number #" + count + " ");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int newNumber = scanner.nextInt();
                sum += newNumber;
                count++;
            }
            else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of the entered numbers is " + sum);
        scanner.close();
    }
}
