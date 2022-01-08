package academy.learnprogramming;

public class Ferrari extends Car {

    public Ferrari() {
        super();
    }
    public Ferrari(int steering, int gear, int speed) {
        super(steering, gear, speed);
    }

    @Override
    public int getSpeed() {
        System.out.println("This is the speed of ferrari");
        return super.getSpeed();
    }

}
