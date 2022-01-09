package academy.learnprogramming;

public class Car {

    private int cylinders, wheel;
    private String name;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheel = 4;
        this.engine = true;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
