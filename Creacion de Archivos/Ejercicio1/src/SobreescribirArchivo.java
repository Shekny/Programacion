import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SobreescribirArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nuevo texto para sobrescribir el archivo : ");
        String texto = scanner.nextLine();

        try (FileWriter escritor = new FileWriter("archivo1.txt")) {
            escritor.write(texto);
            System.out.println("El archivo fue sobrescrito con exito ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al sobrescribir el archivo : " + e.getMessage());
        }
    }
}
