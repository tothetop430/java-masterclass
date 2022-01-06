public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        int max = -1;
        for (int i=2; i<=number; i++) {
            boolean found = true;
            if (number % i == 0) {
                for (int j=2; j<=i/2; j++) {
                    if (i % j == 0) {
                        found = false;
                        break;
                    }
                }
                if (found && max < i) max = i;
            }
        }
        return max;
    }

}
