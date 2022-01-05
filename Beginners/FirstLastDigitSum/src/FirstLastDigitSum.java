public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int sum = 0;
        sum += number % 10;
        while (number > 9) {
            number = number / 10;
        }
        sum += number;
        return sum;
    }

}
