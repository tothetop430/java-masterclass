package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Cars car1 = new Cars();
        Cars car2 = new Cars();

        car1.setModel("carrera");
        System.out.println(car1.getModel());

        car2.setModel("holden");
        System.out.println(car2.getModel());

        car1.setModel("ferrari");
        System.out.println(car1.getModel());
    }
}
