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
//        try {
        x = getInt();
        y = getInt();
        return x / y;
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("No Element Found");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Divide By Zero");
//        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter number again: ");
            }
        }
    }
}
