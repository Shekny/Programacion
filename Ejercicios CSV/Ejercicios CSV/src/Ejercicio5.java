import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void ejecutar() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
            int lineas = 0;
            while (reader.readLine() != null) {
                lineas++;
            }
            reader.close();
            System.out.println("El archivo tiene " + lineas + " líneas.");
        } catch (IOException e) {
            System.out.println("Error al contar las líneas.");
        }
    }
}