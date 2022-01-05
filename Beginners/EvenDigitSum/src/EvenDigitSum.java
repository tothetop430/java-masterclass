public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while(number > 0) {
            sum += ((number % 10) % 2 == 0)? number % 10: 0;
            number = number / 10;
        }
        return sum;
    }

}
