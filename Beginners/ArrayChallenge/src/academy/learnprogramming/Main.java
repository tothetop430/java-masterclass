package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
//        printArray(intArray);
        int[] sortedArray = sortIntegers(intArray);
        printArray(sortedArray);
        printArray(intArray);
    }

    public static int[] sortIntegers(int[] array) {
        int[] temp = Arrays.copyOf(array, array.length);

        for(int i=0; i<temp.length; i++) {
            for(int j=0; j<temp.length-i-1; j++) {
                if (temp[j] < temp[j+1]) {
                    int val = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = val;
                }
            }
        }

        return temp;
    }

    public static void printArray(int[] array) {
        for(int j=0; j<array.length; j++) {
            System.out.println("Element " + j + " contents " + array[j]);
        }
    }

    public static int[] getIntegers(int size) {
        int[] temp = new int[size];
        for(int i=0; i<size; i++) {
            temp[i] = scanner.nextInt();
        }
        return temp;
    }
}
