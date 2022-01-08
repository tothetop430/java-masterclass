package academy.learnprogramming;

public class Vehicle {
    private int steering, gear, speed;

    public Vehicle() {
        this(0, 0, 0);
    }

    public Vehicle(int steering, int gear, int speed) {
        this.steering = steering;
        this.gear = gear;
        this.speed = speed;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
