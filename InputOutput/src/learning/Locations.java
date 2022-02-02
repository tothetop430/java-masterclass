package learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) throws IOException {
        try (FileWriter locFile = new FileWriter("locations.txt");
            FileWriter dirFile = new FileWriter("directions.txt")) {
            for (Location loc : locations.values()) {
                locFile.write(loc.getLocationID() + "," + loc.getDescription() + "\n");
                for (String dir : loc.getExits().keySet()) {
                    dirFile.write(loc.getLocationID() + "," + dir + "," +
                            loc.getExits().get(dir) + "\n");
                }
            }
        }
    }

    static {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("locations.txt"));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                Map<String, Integer> tempExits = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExits));
                System.out.println("Imported loc: " + loc + " : " + description);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("directions.txt")));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(",");

                int loc = Integer.parseInt(data[0]);
                String dirLoc = data[1];
                int exitLocInt = Integer.parseInt(data[2]);

                locations.get(loc).addExit(dirLoc, exitLocInt);
                System.out.println("Added exit for loc: " + loc + " : " + dirLoc + ", " + exitLocInt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) scanner.close();
        }
    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
