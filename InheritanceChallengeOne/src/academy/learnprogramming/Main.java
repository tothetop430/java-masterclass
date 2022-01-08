package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car(2, 2, 10);
        Ferrari ferrari = new Ferrari(2, 5, 100);

        System.out.println("Normal Vehicle");
        System.out.println(vehicle.getGear());
        System.out.println(vehicle.getSpeed());
        System.out.println(vehicle.getSteering());

        System.out.println("Normal Car");
        System.out.println(car.getGear());
        System.out.println(car.getSpeed());
        System.out.println(car.getSteering());

        System.out.println("Ferrari");
        System.out.println(ferrari.getGear());
        System.out.println(ferrari.getSpeed());
        System.out.println(ferrari.getSteering());

    }
}
