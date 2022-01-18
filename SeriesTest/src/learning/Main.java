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
