package academy.learnprogramming;

public class Car extends Vehicle {

    public Car() {
        super();
    }

    public Car(int steering, int gear, int speed) {
        super(steering, gear, speed);
    }

    @Override
    public int getGear() {
        System.out.println("This is Gear for Car");
        return super.getGear();
    }

    @Override
    public int getSpeed() {
        System.out.println("This is Speed for Car");
        return super.getSpeed();
    }

    @Override
    public int getSteering() {
        System.out.println("This is Steering for Car");
        return super.getSteering();
    }

}
