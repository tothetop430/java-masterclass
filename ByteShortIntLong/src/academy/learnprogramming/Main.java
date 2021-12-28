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

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Byte Value = " + minByteValue);
        System.out.println("Maximum Byte Value = " + maxByteValue);
        System.out.println("Minimum Short Value = " + minShortValue);
        System.out.println("Maximum Short Value = " + maxShortValue);

        long longValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value = " + minLongValue);
        System.out.println("Maximum Long Value = " + maxLongValue);

        byte newByteValue = (byte)(minByteValue / 2);
        short newShortValue = (short)(minShortValue / 2);

        System.out.println(newByteValue);
        System.out.println(newShortValue);

        // Challenge

        byte byteValue = 10;
        short shortValue = 10;
        int intValue = 10;
        long totalLongValue = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(totalLongValue);

        short shortTotalValue = (short)(1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotalValue);

    }
}
