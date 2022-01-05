package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sumOfDigits(100));
        System.out.println(sumOfDigits(125));
        System.out.println(sumOfDigits(1));
        System.out.println(sumOfDigits(-1));
        System.out.println(sumOfDigits(123456789));
        System.out.println(sumOfDigits(32123));
    }

    public static int sumOfDigits(int number) {
        if (number < 10) return -1;
        int sum = 0;
        int rem;
        while (number>0) {
            rem = number % 10;
            sum += rem;
            number = number / 10;
        }

        return sum;
    }
}
