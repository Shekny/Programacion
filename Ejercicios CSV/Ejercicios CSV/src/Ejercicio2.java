import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void ejecutar() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
            String linea;
            System.out.println("Contenido del archivo 'datos.csv':");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
