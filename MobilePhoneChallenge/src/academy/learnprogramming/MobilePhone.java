package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact contact1, Contact contact2) {
        if (findContact(contact1) == -1) {
            return false;
        }
        myContacts.set(findContact(contact1), contact2);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) == -1) {
            return false;
        }
        myContacts.remove(findContact(contact));
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i=0; i<myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() +
                    " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {      //only same reference will be caught
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        return findContact(queryContact(name));
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

}
