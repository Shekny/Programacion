import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class Ejercicio10 {
    public static void ejecutar() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("datos1.csv"));
            BufferedReader reader2 = new BufferedReader(new FileReader("datos2.csv"));
            FileWriter writer = new FileWriter("combinado.csv");
            HashSet<String> lineas = new HashSet<>();
            String linea;
            while ((linea = reader1.readLine()) != null) {
                lineas.add(linea);
            }
            while ((linea = reader2.readLine()) != null) {
                lineas.add(linea);
            }
            reader1.close();
            reader2.close();
            for (String l : lineas) {
                writer.write(l + " ");
            }
            writer.close();
            System.out.println("Archivo 'combinado.csv' creado.");
        } catch (IOException e) {
            System.out.println("Error al combinar los archivos.");
        }
    }
}