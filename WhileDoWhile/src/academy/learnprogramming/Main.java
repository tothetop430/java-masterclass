package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 1;
//        while(count!=6) {
//            System.out.println("Count " + count);
//            count++;
//        }
//
//        for(count=1; count<6; count++) {
//            System.out.println("For loop Count " + count);
//        }
//
//
//        count = 1;
//        do {
//            System.out.println("Do While Count " + count);
//            count++;
//        } while (count != 6);

        int number = 4;
        int finalNumber = 20;
        while (number <= finalNumber) {
            number++;
            if(!isEvenNumber(number)) continue;
            System.out.println("Found Even Number is " + number);
        }

    }

    public static boolean isEvenNumber(int number) {
        if (number<0) return false;
        return number % 2 == 0;
    }
}
