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

        System.out.println("****************************************");
        System.out.println(anotherGibberish.matches("^abcDeee"));
        System.out.println(anotherGibberish.matches("^abcDeeeF123ghIabcDeee"));
        System.out.println(anotherGibberish.replaceAll("abcDeee$", "0END"));
        System.out.println(anotherGibberish.replaceAll("[abc]", "Z"));
        System.out.println(anotherGibberish.replaceAll("[abc][D]", "Z"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        System.out.println(anotherGibberish.replaceAll("[^eF]", "Q"));
        System.out.println(anotherGibberish.replaceAll("[a-f]|[1-8]", "(replaced)"));
        System.out.println(anotherGibberish.replaceAll("[a-f1-8]", "(replaced)"));

        System.out.println(anotherGibberish.replaceAll("\\D", "*D"));
        System.out.println("I Q W E R T Y".replaceAll("\\s", ""));

        System.out.println(anotherGibberish.replaceAll("\\w", "x"));
        System.out.println("Q W E R T Y".replaceAll("\\W", "x"));

        System.out.println("******************************");

        System.out.println(anotherGibberish.replaceAll("e{1,2}", "E"));
        System.out.println(anotherGibberish.replaceAll("e{2}", "E"));
        System.out.println(anotherGibberish.replaceAll("e{2,}", "E"));
    }
}
