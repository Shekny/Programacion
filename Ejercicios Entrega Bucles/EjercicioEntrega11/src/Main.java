import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cadena: ");
        String cadena = sc.nextLine();
        int contadorPalabras = 0;
        boolean enPalabra = false;

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (letra == ' ') {
                enPalabra = false;
            } else {
                if (!enPalabra) {
                    contadorPalabras++;
                    enPalabra = true;
                }
            }
        }
        System.out.println("La cantidad de palabras es: " + contadorPalabras);
    }
}