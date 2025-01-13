import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostrarCamposCSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split("-");
                System.out.println("Nombre : " + campos[0] + ", Edad : " + campos[1] + ", Ciudad: " + campos[2]);
            }
        } catch (IOException e) {
            System.out.println("Algo salio mal al leer el archivo ");
        }
    }
}