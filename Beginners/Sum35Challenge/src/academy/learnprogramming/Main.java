package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int sum = 0;
        int count = 0;
        for (int i=1; i<=1000; i++) {
            if (i%15 == 0) {
                sum += i;
                count += 1;
                System.out.println("Number divisible by 3 and 5 is " + i);
            }
            if (count == 10) break;
        }

        System.out.println("Sum of first " + count + " numbers divisible by 3 and 5 is " + sum);
    }
}
