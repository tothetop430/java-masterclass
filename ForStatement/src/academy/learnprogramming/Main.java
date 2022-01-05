package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int i;
//        for(i=0; i<=10; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i);
//        for(i=0; i<=10; ++i) {
//            System.out.println(i);
//        }
//        System.out.println(i);

        for(int i=2; i<9; i++) {
            System.out.println(calculateInterest(10000.0, i));
        }

        //reverse

        for(int i=8; i>1; i--) {
            System.out.printf("%.2f\n", calculateInterest(10000, i));
        }

        // count 3 prime numbers and exit for loop
        int count = 0;
        for (int i=0; i<40; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number = " + i);
                count++;
            }
            if (count>9) break;
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return amount * (rate / 100.0);
    }

    public static boolean isPrime(int n) {
        if (n==1 || n==0) return false;

        for (int i=2; i<=n/2; i++) {
            if (n%i==0) return false;
        }

        return true;
    }
}
