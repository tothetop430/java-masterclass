package learning;

import java.util.Scanner;

/*

Scope challenge, use 'X'/'x' for all variable/methods/class/instance names (except Main).

 */

public class Main {

    public static void main(String[] args) {
        X x = new X(X());
        x.x();
    }

    public static int X() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Value of X: ");
        return x.nextInt();
    }
}
