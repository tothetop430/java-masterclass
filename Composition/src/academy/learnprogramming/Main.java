package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("200A", "Dell", "240",
                dimensions);
        Monitor theMonitor = new Monitor("Xpress", "XPS", 27,
                new Resolution(1080, 1920));
        Motherboard theMotherboard = new Motherboard("Intel X", "Intel",
                4, 4, "2.44");

        PC thePC = new PC(theMotherboard, theMonitor, theCase);
        thePC.powerUp();

        /////////////////////

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(20, "white");
        Bed bed = new Bed("foldable", "yellow", 10, 10, 10, 10);
        Lamp lamp = new Lamp("Classic", true, 75);

        Bedroom bedroom = new Bedroom("Study", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
