public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println(reverse(1010));

        numberToWords(1234);
        numberToWords(-12);
        numberToWords(1010);
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            int reversed = reverse(number);
            int diffZeros = getDigitCount(number) - getDigitCount(reversed);
            String numberWord = "";
            while (reversed>0) {
                int lastDigit = reversed % 10;
                if (lastDigit == 0) numberWord += "Zero ";
                else if (lastDigit == 1) numberWord += "One ";
                else if (lastDigit == 2) numberWord += "Two ";
                else if (lastDigit == 3) numberWord += "Three ";
                else if (lastDigit == 4) numberWord += "Four ";
                else if (lastDigit == 5) numberWord += "Five ";
                else if (lastDigit == 6) numberWord += "Six ";
                else if (lastDigit == 7) numberWord += "Seven ";
                else if (lastDigit == 8) numberWord += "Eight ";
                else numberWord += "Nine ";
                reversed = reversed / 10;
            }
            for (int i=0; i<diffZeros; i++) {
                numberWord += "Zero ";
            }
            System.out.println(!numberWord.equals("") ? numberWord: "Zero");
        }

    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;
        while (number>0) {
            number = number / 10;
            count++;
        }
        return count > 0? count: 1;
    }

    public static int reverse(int number) {
        int tempNumber = Math.abs(number);
        int reversed = 0;
        while (tempNumber>0) {
            reversed = reversed * 10 + (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }
        return reversed * (number < 0? -1: 1);
    }

}
