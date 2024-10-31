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
        System.out.print("Introduce una letra a buscar: ");
        
        char letra = sc.nextLine().charAt(0);

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
    }
}