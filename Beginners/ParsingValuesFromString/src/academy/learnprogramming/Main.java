package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String numberAsString = "2022";
        System.out.println("Number as String " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number as Integer " + number);

        number += 1;
        numberAsString += 1;
        System.out.println("Number As String " + numberAsString + " Number As Interger " + number);


        String doubleAsString = "2022.543";
        System.out.println("Number as String " + doubleAsString);

        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.println("Number as Double " + doubleNumber);

        doubleNumber += 1;
        doubleAsString += 1;
        System.out.println("Number As String " + doubleAsString + " Number As Interger " + doubleNumber);
    }
}
