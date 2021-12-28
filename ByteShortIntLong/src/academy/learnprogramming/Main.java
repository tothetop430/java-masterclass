package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myValue = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Interger Minimum Value = " + minIntValue);
        System.out.println("Interger Maximum Value = " + maxIntValue);
        System.out.println("Busted MAX Int = " + (maxIntValue + 1));
        System.out.println("Busted MIN Int = " + (minIntValue - 1));

        int anotherMaxIntValue = 2_147_483_647;
        System.out.println(anotherMaxIntValue);

    }
}
