import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {
    public static void ejecutar() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                System.out.println("Nombre: " + partes[0] + ", Edad: " + partes[1] + ", Ciudad: " + partes[2]);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer y separar los datos.");
        }
    }
}