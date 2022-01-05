public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(2, 29, 39));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!(isValid(a) && isValid(b) && isValid(c))) return false;
        int remA = a % 10;
        int remB = b % 10;
        int remC = c % 10;
        return remA == remB || remC == remA || remB == remC;
    }

    public static boolean isValid(int a) {
        return a>=10 && a<=1000;
    }

}
