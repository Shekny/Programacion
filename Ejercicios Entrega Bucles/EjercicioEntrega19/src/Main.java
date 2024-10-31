import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Random random = new Random();
        int suma = 0;
        System.out.println("Números aleatorios generados:");

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;
            System.out.print(numeroAleatorio + " ");
            suma += numeroAleatorio;
        }
        double media = suma / 10.0;
        System.out.println("La media de los números es: " + media);
    }
}