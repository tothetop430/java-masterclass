package learning;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int res;
        try {
            res = divide();
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println("Exception Raised " + e);
            res = 0;
        }
        System.out.println("Result is " + res);
    }

    private static int divide() {
        int x, y;
        x = getInt();
        y = getInt();
        return x / y;
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter a number from 0 to 9: ");
            }
        }
    }
}
