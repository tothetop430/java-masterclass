package learning;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "Java Lang");
        languages.put("Python", "Python Lang");
        languages.put("Go", "Go Lang");
        languages.put("R", "R Lang");
        languages.put("JavaScript", "Not Related to Java");

        System.out.println(languages.get("Java"));
        languages.putIfAbsent("Java", "A Java Key Change");
        System.out.println(languages.get("Java"));

        languages.remove("R");
        if (languages.containsKey("Scala")) {
            System.out.println("Scala Key Present");
        }
        else {
            System.out.println("Scala Key Not Present");
        }

        languages.replace("Python", "Favorite Language of All");
        languages.replace("Scala", "Not Present Initially, will not replace");

        for (String str: languages.keySet()) {
            System.out.println(str + " : " + languages.get(str));
        }
    }
}
