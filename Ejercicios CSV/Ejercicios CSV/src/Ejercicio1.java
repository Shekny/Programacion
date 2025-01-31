import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        try {
            FileWriter writer = new FileWriter("datos.csv", true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe tu nombre, edad, ciudad (separados por comas):");
            String linea = scanner.nextLine();
            writer.write(linea + " ");
            writer.close();
            System.out.println("Datos guardados en 'datos.csv'.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }
    }
}