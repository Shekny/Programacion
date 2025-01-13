import java.io.*;
import java.util.HashSet;

public class CombinarCSV {
    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("datos1.csv"));
             BufferedReader reader2 = new BufferedReader(new FileReader("datos2.csv"));
             FileWriter writer = new FileWriter("combinado.csv")) {

            HashSet<String> lineas = new HashSet<>();
            String linea;

            while ((linea = reader1.readLine()) != null) {
                lineas.add(linea);
            }
            while ((linea = reader2.readLine()) != null) {
                lineas.add(linea);
            }

            for (String unica : lineas) {
                writer.write(unica);
            }
            System.out.println("El archivo combinado.csv fue generado ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al combinar los archivos ");
        }
    }
}