import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            else break;
            scanner.nextLine();
        }
        avg = count!=0 ? Math.round((double)sum / (double)count) : 0;
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
