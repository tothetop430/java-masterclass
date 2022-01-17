package learning;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
//        arrayList.add("Sid");
        arrayList.add(4);
        arrayList.add(5);

        printDoubled(arrayList);
    }

    private static void printDoubled(ArrayList<Integer> arrayList) {
        for (int i: arrayList) {
            System.out.println(i*2);
        }
    }
}
