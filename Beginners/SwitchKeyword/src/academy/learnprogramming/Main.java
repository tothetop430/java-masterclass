package academy.learnprogramming;


public class Main {

    public static void main(String[] args) {

        int value = 3;
        if (value == 1) {
            System.out.println("Value is 1");
        }
        else if(value == 2) {
            System.out.println("Value is 2");
        }
        else {
            System.out.println("Neither 1 nor 2");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Neither 1, 2 nor 3");
                break;
        }

        // challenge

        char newSwitchVar = 'F';
        switch (newSwitchVar) {
            case 'A':
                System.out.println("Reached A");
                break;
            case 'B':
                System.out.println("Reached B");
                break;
            case 'C':
                System.out.println("Reached C");
                break;
            case 'D':
                System.out.println("Reached D");
                break;
            case 'E':
                System.out.println("Reached E");
                break;
            default:
                System.out.println("Reached Default Case");
                break;
        }

        String month = "january";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January");
                break;
            default:
                System.out.println("Not January");
                break;
        }
    }
}
