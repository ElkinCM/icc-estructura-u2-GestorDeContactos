package Controller;

import Model.LinkedList;
import Model.Contact;

public class ContactManager {
    private LinkedList<Contact> Contacts;

    public ContactManager(LinkedList<Contact> contact) {
        Contacts = contact;
    }

    public ContactManager() {
        this.Contacts = new LinkedList<>();
    }

    public void addContact(Contact contact) {
        Contacts.appendToTail(contact);
    }

    public void deleteContact(Contact contact) {
        Contacts.deleteByValue(contact);
    }

    public Contact findContact(Contact contact) {
    return Contacts.findByValue(contact);
}


    public void printList() {
        Contacts.print();
    }
}
