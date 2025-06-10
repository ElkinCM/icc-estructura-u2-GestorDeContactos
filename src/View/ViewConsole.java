package View;
import java.util.Scanner;
public class ViewConsole {
    
    Scanner leer = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Welcome to the Contact Manager!");
        System.out.println("1. Add Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Find Contact");
        System.out.println("4. Print Contacts");
        System.out.println("5. Exit");
        System.out.print("Please choose an option: ");
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
    public int getOption() {
        int opcion;
        opcion = leer.nextInt();
        return opcion;
        
    }
}
