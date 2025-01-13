import java.io.*;
import java.util.Scanner;

public class FiltrarLineas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la palabra para filtrar líneas : ");
        String palabra = scanner.nextLine();

        try (BufferedReader lector = new BufferedReader(new FileReader("archivo1.txt"));
             FileWriter escritor = new FileWriter("filtrado.txt")) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.contains(palabra)) {
                    escritor.write(linea + "\n");
                }
            }
            System.out.println("Las líneas filtradas fueron guardadas en filtrado.txt ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al filtrar las líneas : " + e.getMessage());
        }
    }
}
