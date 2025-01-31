import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {
    public static void ejecutar() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
            ArrayList<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
            reader.close();
            Collections.sort(lineas);
            FileWriter writer = new FileWriter("ordenado.csv");
            for (String l : lineas) {
                writer.write(l + " ");
            }
            writer.close();
            System.out.println("Archivo 'ordenado.csv' creado.");
        } catch (IOException e) {
            System.out.println("Error al ordenar las líneas.");
        }
    }
}
