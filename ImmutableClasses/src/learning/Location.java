package learning;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String location;
    private final Map<String, Integer> exits;

    public Location(int locationID, String location, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.location = location;
        if (exits == null) exits = new HashMap<>();
        this.exits = new HashMap<>(exits);      // make it immutable
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        this.exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getLocation() {
        return location;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
