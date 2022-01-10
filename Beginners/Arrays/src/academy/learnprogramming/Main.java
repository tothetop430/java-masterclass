package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] intArray = getIntArray(10);
        printArray(intArray);
        System.out.println("Average of values entered " + getAverage(intArray));
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for(int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public static void printArray(int[] array) {
        System.out.println("Printing elements of an array");
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static int[] getIntArray(int size) {
        System.out.println("Enter " + size + " values");
        int[] temp = new int[size];
        for(int i=0; i<size; i++) {
            temp[i] = scanner.nextInt();
        }
        return temp;
    }
}
