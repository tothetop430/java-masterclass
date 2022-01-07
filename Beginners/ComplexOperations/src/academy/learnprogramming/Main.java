package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1, 1);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1, 1);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());

        one.subtract(number);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());

        number.subtract(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());

        one.add(number);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());

    }
}
