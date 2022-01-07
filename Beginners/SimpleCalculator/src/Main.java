public class Main {

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(5.0);
        calc.setSecondNumber(4);

        System.out.println("Addition " + calc.getAdditionResult());
        System.out.println("Subtraction " + calc.getSubtractionResult());
        System.out.println("Multiplication " + calc.getMultiplicationResult());
        System.out.println("Division " + calc.getDivisionResult());

        calc.setFirstNumber(5.25);
        calc.setSecondNumber(0);

        System.out.println("Addition " + calc.getAdditionResult());
        System.out.println("Subtraction " + calc.getSubtractionResult());
        System.out.println("Multiplication " + calc.getMultiplicationResult());
        System.out.println("Division " + calc.getDivisionResult());
    }

}
