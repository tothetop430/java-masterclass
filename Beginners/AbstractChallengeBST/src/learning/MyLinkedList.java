package learning;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                }
                else {
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            }
            else if (comparison > 0){
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                    return true;
                }
                else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                    return true;
                }
            }
            else {
                System.out.println("Couldn't add item to list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item == null) {
            System.out.println("Cannot remove null from the list");
            return false;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            if (currentItem.compareTo(item) == 0) {
                if (currentItem.previous() == null) {
                    this.root = currentItem.next();
                }
                else if (currentItem.next() == null) {
                    currentItem.previous().setNext(null);
                }
                else {
                    currentItem.previous().setNext(currentItem.next()).setPrevious(currentItem.previous());
                }
                currentItem.setNext(null);
                currentItem.setPrevious(null);
                return true;
            }
            currentItem = currentItem.next();
        }
        System.out.println("Couldn't find " + item.getValue());
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty");
        }
        else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
