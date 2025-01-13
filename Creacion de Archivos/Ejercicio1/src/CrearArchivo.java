import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un texto para guardar en el archivo: ");
        String texto = scanner.nextLine();

        try (FileWriter escritor = new FileWriter("archivo1.txt")) {
            escritor.write(texto);
            System.out.println("El archivo archivo1.txt fue creado con éxito ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al crear el archivo: " + e.getMessage());
        }
    }
}