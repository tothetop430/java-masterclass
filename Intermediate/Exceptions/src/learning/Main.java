package learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 98, y = 0;
        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));

        int z = getIntEAFP();
        System.out.println("z is " + z);
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        String str = scanner.next();
        for(int i=0; i<str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) return Integer.parseInt(str);
        return 0;
    }

    private static int getIntEAFP() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) return x / y;
        else return 0;
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
