package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Integer myIntValue = 42; // Autoboxing internally
        Integer myIntValueExt = Integer.valueOf(42); // explicit autoboxing

        System.out.println(myIntValue);     // Unboxing internally
        System.out.println(myIntValueExt.intValue());       // explicit unboxing

    }
}
