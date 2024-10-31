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
        int contadorConsonantes = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                if (!(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                        letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')) {
                    contadorConsonantes++;
                }
            }
        }
        System.out.println("La cantidad de consonantes es: " + contadorConsonantes);
    }
}