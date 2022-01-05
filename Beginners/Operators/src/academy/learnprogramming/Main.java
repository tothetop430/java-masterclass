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

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien");
            System.out.println("But Aliens are out there!");
        }

        //challenge

        double value20 = 20;
        double value80 = 80;
        double sumTog = (value20 + value80)*100;
        double rem = sumTog % 41;
        boolean boolRes = rem == 0;
        System.out.println(boolRes);
        if (!boolRes)
            System.out.println("Got some remainder");
    }
}
