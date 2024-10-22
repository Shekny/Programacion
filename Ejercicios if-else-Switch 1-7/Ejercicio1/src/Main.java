import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = scanner.next();
        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.next();

        if (usuario.equals("admin") && contrasena.equals("1234")) {
            System.out.println("Administrador");
        } else if (usuario.equals("user") && contrasena.equals("abcd")) {
            System.out.println("Usuario normal");
        } else if (usuario.equals("guest") && contrasena.equals("xyz")) {
            System.out.println("Invitado");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}