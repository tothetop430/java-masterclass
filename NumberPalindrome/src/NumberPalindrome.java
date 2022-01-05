public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber>0) {
            reversed = reversed * 10 + (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }
        return Math.abs(number) == reversed;
    }
}
