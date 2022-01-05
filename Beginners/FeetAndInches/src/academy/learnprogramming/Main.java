package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFeetAndInchesToCentimeters(5, 11));
        System.out.println(calcFeetAndInchesToCentimeter(60));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet<0 || inches<0 || inches>12) return -1;
        return (feet*12d + inches)*2.54d;
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches<0) return -1;
        double feet = (int) inches / 12;
        double inch = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, inch);
    }
}
