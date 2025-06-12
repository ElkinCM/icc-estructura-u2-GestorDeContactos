package View;
import java.util.Scanner;
public class ViewConsole {
    
    Scanner leer = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Agenda de Contactos");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Eliminar Contacto");
        System.out.println("3. Encontrar Contacto");
        System.out.println("4. Imprimir Lista de Contactos");
        System.out.println("5. Exit");
        System.out.print("Please choose an option: ");
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
    public int getOption() {
        return leer.nextInt();
    }
    public String preguntar(String message) {
        System.out.print(message);
        return leer.next();
    }
}
