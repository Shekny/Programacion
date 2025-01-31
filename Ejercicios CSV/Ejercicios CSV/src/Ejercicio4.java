import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        try {
            FileWriter writer = new FileWriter("datos.csv");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sobreescribe todo el contenido en formato nombre,edad,ciudad (escribe 'fin' para terminar):");
            String linea;
            while (!(linea = scanner.nextLine()).equals("fin")) {
                writer.write(linea + " ");
            }
            writer.close();
            System.out.println("Archivo sobrescrito.");
        } catch (IOException e) {
            System.out.println("Error al sobrescribir el archivo.");
        }
    }
}
