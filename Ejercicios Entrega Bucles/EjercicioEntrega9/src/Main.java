import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número N: ");
        int N = sc.nextInt();
        int suma = 0;

        for (int i = 2; i <= N; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares desde 1 hasta " + N + " es: " + suma);
    }
}