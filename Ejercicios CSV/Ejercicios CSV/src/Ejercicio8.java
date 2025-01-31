import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {
    public static void ejecutar() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
            FileWriter writer = new FileWriter("adultos.csv");
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (Integer.parseInt(partes[1]) >= 18) {
                    writer.write(linea + " ");
                }
            }
            reader.close();
            writer.close();
            System.out.println("Archivo 'adultos.csv' creado.");
        } catch (IOException e) {
            System.out.println("Error al filtrar las líneas.");
        }
    }
}
