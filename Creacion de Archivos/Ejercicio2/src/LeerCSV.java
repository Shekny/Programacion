import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Algo salio mal al leer el archivo ");
        }
    }
}