package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Contact contact1 = new Contact("abc", "123");
        Contact contact2 = new Contact("def", "456");
        Contact contact3 = new Contact("ghi", "789");
        Contact contact4 = new Contact("abc", "456");
        Contact contact5 = new Contact("def", "456");

        ArrayList<Contact> myContacts = new ArrayList<>();

        myContacts.add(contact1);
        myContacts.add(contact2);
        myContacts.add(contact3);

        System.out.println(myContacts.indexOf(contact4));   //different reference
    }
}
