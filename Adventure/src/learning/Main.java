package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, Location> locationMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locationMap.put(0, new Location(0, "At Location 0"));
        locationMap.put(1, new Location(1, "At Location 1"));
        locationMap.put(2, new Location(2, "At Location 2"));
        locationMap.put(3, new Location(3, "At Location 3"));
        locationMap.put(4, new Location(4, "At Location 4"));
        locationMap.put(5, new Location(5, "At Location 5"));

        while(true) {
            int loc = scanner.nextInt();
            if (!locationMap.containsKey(loc)) {
                System.out.println(loc + " is not present on the map, try again.");
                continue;
            }
            System.out.println("You are at " + locationMap.get(loc).getLocation());
            if (loc == 0) {
                System.out.println("breaking out of the loop");
                break;
            }
        }
    }
}
