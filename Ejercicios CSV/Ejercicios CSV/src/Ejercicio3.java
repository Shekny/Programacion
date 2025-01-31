import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        try {
            FileWriter writer = new FileWriter("datos.csv", true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe varias líneas en formato nombre,edad,ciudad (escribe 'fin' para terminar):");
            String linea;
            while (!(linea = scanner.nextLine()).equals("fin")) {
                writer.write(linea + " ");
            }
            writer.close();
            System.out.println("Líneas agregadas a 'datos.csv'.");
        } catch (IOException e) {
            System.out.println("Error al guardar las líneas.");
        }
    }
}
