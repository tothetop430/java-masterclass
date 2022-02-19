package learning;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> aList = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"
        );

        aList.stream()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .filter(s -> s.compareTo("E") > 0)
                .forEach(System.out::println);
    }
}
