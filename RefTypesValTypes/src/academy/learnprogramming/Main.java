package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int val1 = 1;
        int val2 = val1;

        System.out.println(val1);
        System.out.println(val2);

        val2++;
        System.out.println(val1);
        System.out.println(val2);   // value types

        int[] array1 = new int[5];
        int[] array2 = array1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2[0] = 1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));      // reference types

        changeArray(array1);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    private static void changeArray(int[] array) {
        array[1] = 2;
        array = new int[2];
    }
}
