package learning;

import com.math.series.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of first 0 to 10 numbers: ");
	    for (int i=0; i<=10; i++) {
            Series.nSum(i);
        }

        System.out.println("Factorial of first 0 to 10 numbers: ");
        for (int i=0; i<=10; i++) {
            Series.factorial(i);
        }

        System.out.println("Fibonacci sequence of first 0 to 10 numbers: ");
        for (int i=0; i<=10; i++) {
            Series.fibonacci(i);
        }
    }
}

/*

Sum of first 0 to 10 numbers:
0
0 1
0 1 3
0 1 3 6
0 1 3 6 10
0 1 3 6 10 15
0 1 3 6 10 15 21
0 1 3 6 10 15 21 28
0 1 3 6 10 15 21 28 36
0 1 3 6 10 15 21 28 36 45
0 1 3 6 10 15 21 28 36 45 55
Factorial of first 0 to 10 numbers:
1
1 1
1 1 2
1 1 2 6
1 1 2 6 24
1 1 2 6 24 120
1 1 2 6 24 120 720
1 1 2 6 24 120 720 5040
1 1 2 6 24 120 720 5040 40320
1 1 2 6 24 120 720 5040 40320 362880
1 1 2 6 24 120 720 5040 40320 362880 3628800
Fibonacci sequence of first 0 to 10 numbers:
0
0 1
0 1 1
0 1 1 2
0 1 1 2 3
0 1 1 2 3 5
0 1 1 2 3 5 8
0 1 1 2 3 5 8 13
0 1 1 2 3 5 8 13 21
0 1 1 2 3 5 8 13 21 34
0 1 1 2 3 5 8 13 21 34 55

 */
