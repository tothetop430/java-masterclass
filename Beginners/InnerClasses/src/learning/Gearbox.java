package learning;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        this.clutchIsIn = true;
        this.currentGear = 0;
    }

    public boolean operateClutch(boolean in) {
        this.clutchIsIn = in;
        return in;
    }

    public boolean addGear(int gearNumber, double ratio) {
        if (gearNumber<0 || gearNumber>maxGears) {
            System.out.println("Cannot go beyond " + maxGears);
            return false;
        }
        this.gears.add(new Gear(gearNumber, ratio));
        System.out.println("Gear Added Successfully");
        return true;
    }

    public boolean changeGear(int gearNumber) {
        if ((gearNumber<0 || gearNumber>maxGears) && !clutchIsIn) {
            currentGear = 0;
            System.out.println("Cannot go beyond " + maxGears);
            return false;
        }
        this.currentGear = gearNumber;
        return true;
    }

    public double wheelSpeed(int revs) {
        return revs * this.gears.get(this.currentGear).getRatio();
    }

    private class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(double revs) {
            return revs * (ratio);
        }

    }
}
