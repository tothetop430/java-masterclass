package learning;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Sunny");
        dog.breathe();
        dog.eat();


        Parrot parrot = new Parrot("Pinku");
        parrot.fly();

        Penguin penguin = new Penguin("Peng");
        penguin.fly();

    }
}
