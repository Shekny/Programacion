import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {
        try (BufferedReader lector = new BufferedReader(new FileReader("archivo1.txt"))) {
            String linea;
            System.out.println("Contenido del archivo 'archivo1.txt':");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Algo salio mal al leer el archivo: " + e.getMessage());
        }
    }
}