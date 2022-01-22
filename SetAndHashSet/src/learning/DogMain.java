package learning;

public class DogMain {

    public static void main(String[] args) {
        Labrador lab = new Labrador("Lab");
        Dog dog = new Dog("Lab");

        System.out.println(dog.equals(lab));
        System.out.println(lab.equals(dog));
    }

}

