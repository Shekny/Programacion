import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento;
        System.out.println("Adivina el número entre 1 y 100");

        do {
            System.out.print("Introduce el numero: ");
            intento = sc.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("Bajo. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (intento != numeroAleatorio);
    }
}