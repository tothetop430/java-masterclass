package com.math.series;

public class Series {

    public static void nSum(int n) {
        int i;
        int sum = 0;
        for (i=0; i<=n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void factorial(int n) {
        int i;
        int fact=1;
        for (i=0; i<=n; i++) {
            if (i!=0) fact *= i;
            System.out.print(fact + " ");
        }
        System.out.println();
    }

    public static void fibonacci(int n) {
        int i;
        int f1=0, f2=1;
        for (i=0; i<=n; i++) {
            if (i==0) System.out.print(f1 + " ");
            else if (i==1) System.out.print(f2 + " ");
            else {
                f2 = f1 ^ f2 ^ (f1 = f2);
                f2 = f1 + f2;
                System.out.print(f2 + " ");
            }
        }
        System.out.println();
    }
}
