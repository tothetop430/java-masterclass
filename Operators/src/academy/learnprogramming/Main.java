package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int prevResult = result;
        result = result - 1;
        System.out.println("New Result " + result);
        System.out.println("Prev Result " + prevResult);
        result = result * 10;
        System.out.println("2 * 10 " + result);
        result = result / 5;
        System.out.println("20 / 5 " + result);

        result = result % 3;
        System.out.println("4 % 3 " + result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 5;
        System.out.println(result);
        result *= 3;
        System.out.println(result);
        result /= 10;
        System.out.println(result);
        result %= 3;
        System.out.println(result);
    }
}
