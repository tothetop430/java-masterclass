package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
