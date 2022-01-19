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

        // Exits for location 1
        locationMap.get(1).addExit("N", 5);
        locationMap.get(1).addExit("S", 4);
        locationMap.get(1).addExit("E", 3);
        locationMap.get(1).addExit("W", 2);

        // Exits for location 2
        locationMap.get(2).addExit("N", 5);

        // Exits for location 3
        locationMap.get(3).addExit("W", 1);

        // Exits for location 4
        locationMap.get(4).addExit("W", 2);
        locationMap.get(4).addExit("N", 1);

        // Exits for location 5
        locationMap.get(5).addExit("S", 1);
        locationMap.get(5).addExit("W", 2);

        int loc = 1;
        while(true) {
            System.out.println("You are at " + locationMap.get(loc).getLocation());
            if (loc == 0) {
                System.out.println("breaking out of the loop");
                break;
            }

            Map<String, Integer> exits = locationMap.get(loc).getExits();
            System.out.print("Available Exits are: ");
            for (String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.print("\nSelect your exit: ");
            String choice = scanner.nextLine().toUpperCase();
            if (!exits.containsKey(choice)) {
                System.out.println("Selected direction " + choice + " is not present.");
            }
            else loc = exits.get(choice);
        }
    }
}
