import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int intento = 0;
        System.out.println("¡Bienvenido al juego de adivinar el número!");

        while (true) {
            System.out.print("Adivina un número entre 1 y 10: ");
            intento = sc.nextInt();
            
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                break;
            } else {
                System.out.println("Intenta de nuevo.");
            }
        }
        System.out.println("Gracias por jugar.");
    }
}