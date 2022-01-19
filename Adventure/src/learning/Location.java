package learning;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String location;
    private final Map<String, Integer> exits;

    public Location(int locationID, String location) {
        this.locationID = locationID;
        this.location = location;
        this.exits = new HashMap<>();
    }

    public void addExit(String direction, int location) {
        this.exits.put(direction, location);
    }

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
