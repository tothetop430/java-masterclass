package learning;

public class Main {

    public static void main(String[] args) {
        String simplString = "I Am You. You Am I";
        System.out.println(simplString);
        String gibberish = simplString.replaceAll("I", "You");
        System.out.println(gibberish);

        String anotherGibberish = "abcDeeeF123ghIabcDeee";
        System.out.println(anotherGibberish.replaceAll(".", "Y"));
        System.out.println(anotherGibberish.replaceAll("^abcDee", "YYY"));

//        System.out.println("****************************************");
//        System.out.println(anotherGibberish.matches("^abcDeee"));
//        System.out.println(anotherGibberish.matches("^abcDeeeF123ghIabcDeee"));
//        System.out.println(anotherGibberish.replaceAll("abcDeee$", "0END"));
//        System.out.println(anotherGibberish.replaceAll("[abc]", "Z"));
//        System.out.println(anotherGibberish.replaceAll("[abc][D]", "Z"));
    }
}
