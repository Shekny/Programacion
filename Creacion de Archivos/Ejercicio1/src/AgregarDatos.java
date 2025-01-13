import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AgregarDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una línea de texto para agregar al archivo : ");
        String texto = scanner.nextLine();

        try (FileWriter escritor = new FileWriter("archivo1.txt", true)) {
            escritor.write(texto + "\n");
            System.out.println("La linea fue agregada al archivo con exito");
        } catch (IOException e) {
            System.out.println("Algo salio mal al agregar datos al archivo : " + e.getMessage());
        }
    }
}