import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BuscarPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la palabra a buscar : ");
        String palabra = scanner.nextLine();
        int contador = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader("archivo1.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                contador += linea.split(palabra, -1).length - 1;
            }
            System.out.println("La palabra " + palabra + " aparece " + contador + " veces ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al buscar la palabra : " + e.getMessage());
        }
    }
}