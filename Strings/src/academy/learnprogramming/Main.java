package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String stringValue = "My String";
        String newStringValue = stringValue + " new String Value";
        System.out.println(newStringValue);
        String uniStringValue = newStringValue + " \u00A9";
        System.out.println(uniStringValue);

        String aValue = "50";
        int intValue = 10;
        String lastString = uniStringValue + aValue + intValue;
        double aDouble = 120.95;
        lastString = lastString + aDouble;
        System.out.println(lastString);
    }
}
