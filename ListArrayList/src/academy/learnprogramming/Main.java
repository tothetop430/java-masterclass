package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add items in grocery list...");
        for(int i=0; i<5; i++) {
            addElement(scanner.nextLine());
        }

        printElements();

        removeElement(3);

        System.out.println(getSize());

        setElement(1, "Anything");

        printElements();
    }

    private static void addElement(String name) {
        groceryList.add(name);
    }

    private static void removeElement(int i) {
        groceryList.remove(i);
    }

    private static void setElement(int i, String name) {
        groceryList.set(i, name);
    }

    private static int getSize() {
        return groceryList.size();
    }

    private static void printElements() {
        for(int i=0; i<getSize(); i++) {
            System.out.println("Element " + (i+1) + " is " + groceryList.get(i));
        }
    }
}
