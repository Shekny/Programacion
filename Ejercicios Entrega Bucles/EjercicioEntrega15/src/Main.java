import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        int contador = 0;

        if (numero == 0) {
            contador = 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                contador++;
            }
            if (numero < 0) {
                contador--;
            }
        }
        System.out.println("El número de dígitos es: " + contador);
    }
}