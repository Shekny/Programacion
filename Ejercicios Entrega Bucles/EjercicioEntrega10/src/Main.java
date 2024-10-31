import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contador = 0;
        String cadenamasLarga = "";

        while (true) {
            System.out.print("Introduce una cadena (escribe 'salir' para terminar): ");
            cadena = sc.nextLine();

            if (cadena.toLowerCase().equals("salir")) {
                break;
            }
            contador++;

            if (cadena.length() > cadenamasLarga.length()) {
                cadenamasLarga = cadena;
            }
        }
        System.out.println("Cantidad de cadenas ingresadas: " + contador);
        if (contador > 0) {
            System.out.println("La cadena más larga es: " + cadenamasLarga);
        } else {
            System.out.println("No se ingresaron cadenas.");
        }
    }
}