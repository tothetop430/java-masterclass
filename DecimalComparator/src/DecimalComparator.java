public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int iFirst = (int)(first * 1000);
        int iSecond = (int)(second * 1000);
        return iFirst == iSecond;
    }
}
