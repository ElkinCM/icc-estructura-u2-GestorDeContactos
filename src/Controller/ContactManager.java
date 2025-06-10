package Controller;
import Model.LinkedList;
import Model.Contact;

public class ContactManager {
    private LinkedList<Contact<String, String>> Contacts;

    public ContactManager(LinkedList<Model.Contact<String, String>> contact) {
        Contacts = contact;
    }

    public ContactManager() {
        this.Contacts = new LinkedList<>();
    }

    public void addContact(Contact<String, String> contact) {
        Contacts.appendToTail(contact);
    }
    
    public void deleteContact(Contact<String, String> contact) {
        Contacts.deleteByValue(contact);
    }

    public void findContact(Contact<String, String> contact) {
        Contacts.findByValue(contact);
    }
    public void printList() {
        Contacts.print();
    }

}
 