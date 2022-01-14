package learning;

public class Main {

    public static void main(String[] args) {
        Gearbox gearbox = new Gearbox(6);
//        Gearbox.Gear first = gearbox.new Gear(1, 12.1);
//        System.out.println(first.driveSpeed(10));
        gearbox.addGear(1, 12.1);
        gearbox.addGear(2, 15.1);
        gearbox.addGear(3, 18.1);
        gearbox.addGear(4, 21.1);
        gearbox.addGear(5, 24);
        gearbox.addGear(6, 30);

        gearbox.operateClutch(false);

        System.out.println(gearbox.wheelSpeed(100));

        gearbox.changeGear(2);

        System.out.println(gearbox.wheelSpeed(100));
    }
}
