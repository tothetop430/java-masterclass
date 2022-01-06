package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static final String INVALID = "Invalid Year Of Birth";
    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User YOB: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yob = scanner.nextInt();
            scanner.nextLine();

            if(yob<1000 || yob>9999) System.out.println(INVALID);
            else {
                System.out.print("Enter User Name: ");
                String name = scanner.nextLine();
                System.out.println("User, " + name + " is " + (2022 - yob) + " years old.");
            }
        }
        else {
            System.out.println(INVALID);
        }

        scanner.close();
    }
}
