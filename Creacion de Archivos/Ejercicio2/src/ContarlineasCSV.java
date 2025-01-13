import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarlineasCSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"))) {
            int contador = 0;
            while (reader.readLine() != null) {
                contador++;
            }
            System.out.println("El archivo datos.csv tiene " + contador + " líneas ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al leer el archivo.");
        }
    }
}