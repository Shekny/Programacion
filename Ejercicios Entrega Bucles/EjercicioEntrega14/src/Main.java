import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (Character.isLowerCase(letra)) {
                resultado += Character.toUpperCase(letra);
            } else if (Character.isUpperCase(letra)) {
                resultado += Character.toLowerCase(letra);
            } else {
                resultado += letra;
            }
        }
        System.out.println("Cadena con el caso cambiado: " + resultado);
    }
}