public class MegaBytes {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        int megaBytes = kiloBytes / 1024;
        int remKB = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " and " + remKB + "KB");
    }
}
