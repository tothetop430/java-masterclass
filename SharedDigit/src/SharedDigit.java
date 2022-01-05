public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(-9, 99));
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1<10 || n1>99 || n2<10 || n2>99) return false;
        do {
            int rem1 = n1 % 10;
            int tempN2 = n2;
            while(tempN2 > 0) {
                int rem2 = tempN2 % 10;
                if (rem1 == rem2) {
                    return true;
                }
                tempN2 = tempN2 / 10;
            }
            n1 = n1 / 10;
        } while (n1 > 0);

        return false;
    }

}
