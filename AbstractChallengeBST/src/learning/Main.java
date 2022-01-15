package learning;

public class Main {

    public static void main(String[] args) {
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        String data = "9 5 3 0 4 1 2 7 8 6";
        String[] dataList = data.split(" ");
        for (String s: dataList) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("1"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("11"));
    }
}
