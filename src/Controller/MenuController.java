package Controller;

import View.ViewConsole;

public class MenuController {
    
    ViewConsole ViewConsole;
    ContactManager contactManager;

    public void showMenu() {
        ViewConsole = new ViewConsole();
        ViewConsole.showMenu();
        do {
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
        contactManager.addContact(null);

    }
    private void deleteContact() {
        contactManager.deleteContact(null);
        
    }
    private void findContact() {
        contactManager.findContact(null);        
    }
    private void printList() {
        contactManager.printList();
        
    }


}