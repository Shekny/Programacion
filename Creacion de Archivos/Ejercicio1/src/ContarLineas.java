import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void main(String[] args) {
        int contador = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader("archivo1.txt"))) {
            while (lector.readLine() != null) {
                contador++;
            }
            System.out.println("El archivo tiene " + contador + " lineas ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al contar las lineas : " + e.getMessage());
        }
    }
}