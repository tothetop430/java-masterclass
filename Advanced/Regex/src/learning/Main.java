package learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        System.out.println("******************************");

        StringBuilder htmlText = new StringBuilder();
        htmlText.append("<h2>ksdjfghsdkgj</h2>");
        htmlText.append("<h3>kdsjfgdsg</h3>");
        htmlText.append("<h2>sdkjfghsd</h2>");

        String h2pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        System.out.println("**************************");
        String groupPattern = "(<h2>.*?</h2>)";
        Pattern gPattern = Pattern.compile(groupPattern);
        Matcher groupMatcher = gPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());

        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrences : " + groupMatcher.group(1));
        }
    }
}
