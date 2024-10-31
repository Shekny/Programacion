import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud del lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.print("Ingresa la longitud del lado 2: ");
        int lado2 = scanner.nextInt();
        System.out.print("Ingresa la longitud del lado 3: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("Su Triangulo es Equilátero");
            }
            else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                System.out.println("Su Triangulo es Isósceles");
            }
            else {
                System.out.println("Su Triangulo es Escaleno");
            }
        } else {
            System.out.println("No es un triangulo");
        }
    }
}