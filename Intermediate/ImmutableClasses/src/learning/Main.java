package learning;

import java.util.*;

public class Main {
    private static final Map<Integer, Location> locationMap = new HashMap<>();
    public static void main(String[] args) {
        Map<String, Integer> locationIDMap1 = new HashMap<>();
        // Exits for location 1
        locationIDMap1.put("N", 5);
        locationIDMap1.put("S", 4);
        locationIDMap1.put("E", 3);
        locationIDMap1.put("W", 2);

        Map<String, Integer> locationIDMap2 = new HashMap<>();
        // Exits for location 2
        locationIDMap2.put("N", 5);

        Map<String, Integer> locationIDMap3 = new HashMap<>();
        // Exits for location 3
        locationIDMap3.put("W", 1);

        Map<String, Integer> locationIDMap4 = new HashMap<>();
        // Exits for location 4
        locationIDMap4.put("W", 2);
        locationIDMap4.put("N", 1);

        Map<String, Integer> locationIDMap5 = new HashMap<>();
        // Exits for location 5
        locationIDMap5.put("S", 1);
        locationIDMap5.put("W", 2);

        locationMap.put(0, new Location(0, "At Location 0", null));
        locationMap.put(1, new Location(1, "At Location 1", locationIDMap1));
        locationMap.put(2, new Location(2, "At Location 2", locationIDMap2));
        locationMap.put(3, new Location(3, "At Location 3", locationIDMap3));
        locationMap.put(4, new Location(4, "At Location 4", locationIDMap4));
        locationMap.put(5, new Location(5, "At Location 5", locationIDMap5));

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
            String choice = getChoice();
            if (!exits.containsKey(choice)) {
                System.out.println("Selected direction " + choice + " is not present.");
            }
            else loc = exits.get(choice);
        }

    }

    private static String getChoice() {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine()
                .replace(',', ' ')
                .toLowerCase()
                .split(" ");
        String choice = words[0];
        label:
        for (String word: words) {
            switch (word) {
                case "north":
                    choice = "N";
                    break label;
                case "south":
                    choice = "S";
                    break label;
                case "east":
                    choice = "E";
                    break label;
                case "west":
                    choice = "W";
                    break label;
                case "quit":
                    choice = "Q";
                    break label;
            }
        }
        return choice.toUpperCase();
    }

}
