package Controller;

import View.ViewConsole;
import Model.Contact;
public class MenuController {
    
    ViewConsole ViewConsole;
    ContactManager contactManager;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.ViewConsole = new ViewConsole();
    }

    public void showMenu() {
        ViewConsole = new ViewConsole();
        ViewConsole.showMenu();
        do {
            ViewConsole.showMenu();
            int option = ViewConsole.getOption();
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    findContact();
                    break;
                case 4:
                    printList();
                    break;
                case 5:
                    ViewConsole.showMessage("Exiting the application.");
                    return;
                default:
                    ViewConsole.showMessage("Invalid option. Please try again.");
            }
        } while (true);
    }
    private void addContact() {
        String name = ViewConsole.preguntar("Ingresa el nombre: ");
        String phone = ViewConsole.preguntar("Ingresa el numero: ");
        Contact contact = new Contact(name, phone);
        contactManager.addContact(contact);
        ViewConsole.showMessage("Contacto agregado: " + contact.toString());

    }
    private void deleteContact() {
    String name = ViewConsole.preguntar("Ingresa el nombre del contacto a eliminar: ");
    Contact contact = new Contact(name, null);
    contactManager.deleteContact(contact);
    ViewConsole.showMessage("Contacto eliminado (si existía): " + contact.getName()); 
}


    private void findContact() {
    String name = ViewConsole.preguntar("Ingresa el nombre del contacto a buscar: ");
    Contact contact = new Contact(name, null); // puedes usar null en el número
    Contact found = contactManager.findContact(contact);
    if (found != null) {
        ViewConsole.showMessage("Contacto encontrado: " + found.toString());
    } else {
        ViewConsole.showMessage("Contacto no encontrado.");
    }
}


    private void printList() {
        contactManager.printList();
        
    }


}