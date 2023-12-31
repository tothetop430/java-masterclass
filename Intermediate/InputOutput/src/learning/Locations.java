package learning;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static final Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        // Using DataOutputStream
//        try (DataOutputStream locFile = new DataOutputStream(
//                new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
//            for (Location location : locations.values()) {
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location : " + location.getLocationID() +
//                        " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
//                locFile.writeInt(location.getExits().size() - 1);
//                for (String direction : location.getExits().keySet()) {
//                    if(!direction.equalsIgnoreCase("Q")) {
//                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//                    }
//                }
//            }
//        }

        // Using ObjectOutputStream
        try (ObjectOutputStream locFile = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for (Location location : locations.values()) {
                locFile.writeObject(location);
            }
        }
    }

    static {

        // Using ObjectInputStream
        try (ObjectInputStream locFile = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("locations.dat")))) {

            boolean eof = false;
            while(!eof) {
                try {
                    Location location = (Location) locFile.readObject();
                    System.out.println("Reading location " + location.getLocationID() +
                            " : " + location.getDescription());
                    System.out.println("Reading " + location.getExits().size() + " exits.");
                    locations.put(location.getLocationID(), location);
                } catch (EOFException io) {
                    System.out.println("Caught EOF " + io.getMessage());
                    eof = true;
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not exception " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Caught IO " + e.getMessage());
        }

        // Using DataInputStream
//        try (DataInputStream locFile = new DataInputStream(
//                new BufferedInputStream(new FileInputStream("locations.dat")))) {
//            boolean eof = false;
//            while(!eof) {
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locId = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int totalExits = locFile.readInt();
//                    System.out.println("Reading location : " + locId + " : " + description);
//                    System.out.println("Reading " + totalExits + " exits.");
//                    for (int i = 0; i < totalExits; i++) {
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction, destination);
//                        System.out.println("\t\t" + direction + "--" + destination);
//                    }
//                    locations.put(locId, new Location(locId, description, exits));
//                } catch (EOFException e) {
//                    eof = true;
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Caught IOException other than EOFException");
//            e.printStackTrace();
//        }

        // Using BufferedReader
//        try (BufferedReader locFile = new BufferedReader(new FileReader("locations_big.txt"))) {
//            String input;
//            while((input = locFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String description = data[1];
//                Map<String, Integer> tempExits = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExits));
//                System.out.println("Imported loc: " + loc + " : " + description);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader dirFile = new BufferedReader(
//                new FileReader("directions_big.txt"))) {
//            String input;
//            while((input = dirFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String dirLoc = data[1];
//                int exitLocInt = Integer.parseInt(data[2]);
//                locations.get(loc).addExit(dirLoc, exitLocInt);
//                System.out.println("Added exit for loc: " + loc + " : " + dirLoc + ", " + exitLocInt);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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
