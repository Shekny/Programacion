import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarCSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
             FileWriter writer = new FileWriter("ordenado.csv")) {

            ArrayList<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }

            Collections.sort(lineas);
            for (String ordenada : lineas) {
                writer.write(ordenada);
            }
            System.out.println("El archivo ordenado.csv fue generado ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al ordenar los datos ");
        }
    }
}