package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

//        linkedList.add("Ghaziabad");
//        linkedList.add("Kanpur");
//        linkedList.add("Gurugram");
//        linkedList.add("Delhi");
//        linkedList.add("Chennai");
//        linkedList.add("Bengaluru");

        addInOrder(linkedList, "Ghaziabad");
        addInOrder(linkedList, "Kanpur");
        addInOrder(linkedList, "Gurugram");
        addInOrder(linkedList, "Delhi");
        addInOrder(linkedList, "Chennai");
        addInOrder(linkedList, "Bengaluru");

        printLinkedList(linkedList);
        System.out.println("====");

//        linkedList.add(1, "Noida");
        addInOrder(linkedList, "Noida");
        printLinkedList(linkedList);
//        System.out.println("====");

//        linkedList.remove(2);
//        printLinkedList(linkedList);

        visit(linkedList);

    }

    private static void printLinkedList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while(i.hasNext()) {
            System.out.println("Linked List value " + i.next());
        }
    }

    private static boolean addInOrder(LinkedList<String> list, String name) {
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(name);
            if(comparison == 0) {
                // no need to add
                System.out.println("Place already present");
                return false;
            }
            if (comparison > 0) {
                listIterator.previous();
                listIterator.add(name);
                return true;
            }
        }
        listIterator.add(name);
        return true;
    }

    private static void visit(LinkedList<String> list) {
        ListIterator<String> i = list.listIterator();
        boolean visiting = true;
        boolean forward = true;
        if(list.isEmpty()) {
            System.out.println("List is Empty");
        }
        else {
            System.out.println("Now Visiting " + i.next());
            printMenu();
        }

        Scanner scanner = new Scanner(System.in);
        while (visiting) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 0) {
                System.out.println("Quiting the visiting");
                visiting = false;
            }
            else if (choice == 1) {
                if(!forward) {
                    i.next();
                    forward = true;
                }
                if (i.hasNext()) {
                    System.out.println("Next City " + i.next());
                } else {
                    System.out.println("No Next City to visit");
                    printMenu();
                }
            }
            else if (choice == 2) {
                if(forward) {
                    i.previous();
                    forward = false;
                }
                if(i.hasPrevious()) {
                    System.out.println("Previous City " + i.previous());
                } else {
                    System.out.println("No Previous City");
                    printMenu();
                }
            }
            else if(choice == 3) {
                printMenu();
            }
        }
    }

    private static void printMenu() {
        System.out.println("Type Choice From Below Menu\n" +
                "0 - Quit\n" +
                "1 - Move to Next City\n" +
                "2 - Move to Previous City\n" +
                "3 - Print Menu Items\n");
    }
}
