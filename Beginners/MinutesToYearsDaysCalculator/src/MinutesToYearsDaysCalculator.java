public class MinutesToYearsDaysCalculator {

    public static final String INVALID = "Invalid Value";
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println(INVALID);
        else {
            long days = minutes / 1440;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

}
