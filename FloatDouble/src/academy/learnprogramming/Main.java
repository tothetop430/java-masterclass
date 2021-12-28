package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + minFloatValue);
        System.out.println("Float Max Value = " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + minDoubleValue);
        System.out.println("Double Max Value = " + maxDoubleValue);

        int intValue = 5 / 3;
        float floatValue = 5f / 3;
        double doubleValue = 5d / 3d;

        System.out.println("intValue " + intValue + " floatValue " + floatValue +
                " doubleValue " + doubleValue);


        // challenge convert pounds to kg
        double pounds = 200;
        double kilogram = pounds * 0.45359237;
        System.out.println(kilogram);
    }
}
