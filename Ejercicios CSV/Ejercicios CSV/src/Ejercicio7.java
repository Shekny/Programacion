import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 {
    public static void ejecutar() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
            FileWriter writer = new FileWriter("copia_datos.csv");
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + " ");
            }
            reader.close();
            writer.close();
            System.out.println("Contenido copiado a 'copia_datos.csv'.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo.");
        }
    }
}