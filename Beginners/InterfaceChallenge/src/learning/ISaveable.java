package learning;

import java.util.List;

public interface ISaveable {
    List<String> write();       // write to the console kind of functionality
    void read(List<String> savedValues);        // read from the console kind of functionality
}
