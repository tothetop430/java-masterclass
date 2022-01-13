package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ghaziabad");
        linkedList.add("Kanpur");
        linkedList.add("Gurugram");
        linkedList.add("Delhi");
        linkedList.add("Chennai");
        linkedList.add("Bengaluru");

        printLinkedList(linkedList);
        System.out.println("====");

        linkedList.add(1, "Noida");
        printLinkedList(linkedList);
        System.out.println("====");

        linkedList.remove(2);
        printLinkedList(linkedList);
    }

    private static void printLinkedList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while(i.hasNext()) {
            System.out.println("Linked List value " + i.next());
        }
    }



}
