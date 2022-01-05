package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(5555, 43));
        System.out.println(getDurationString(1500));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes<0 || seconds<0 || seconds>59) return "Invalid Value";
        String preh = "";
        String prem = "";
        String pres = "";
        int min = minutes%60;
        int hr = minutes/60;
        if (hr<10) {
            preh = "0";
        }
        if (min<10) {
            prem = "0";
        }
        if (seconds<10) {
            pres = "0";
        }
        return preh + hr + "h " + prem + min + "m " + pres + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds<0) return "Invalid Value";
        int min = seconds/60;
        int sec = seconds%60;
        return getDurationString(min, sec);
    }
}
