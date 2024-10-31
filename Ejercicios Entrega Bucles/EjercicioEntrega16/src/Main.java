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
        int suma = 0;
        numero = Math.abs(numero);

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}