import java.io.*;

public class ConcatenarArchivos {
    public static void main(String[] args) {
        try (BufferedReader lector1 = new BufferedReader(new FileReader("archivo1.txt"));
             BufferedReader lector2 = new BufferedReader(new FileReader("archivo2.txt"));
             FileWriter escritor = new FileWriter("archivo3.txt")) {
            String linea;

            while ((linea = lector1.readLine()) != null) {
                escritor.write(linea + "\n");
            }

            while ((linea = lector2.readLine()) != null) {
                escritor.write(linea + "\n");
            }

            System.out.println("Los contenidos fueron concatenados en archivo3.txt ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al concatenar los archivos : " + e.getMessage());
        }
    }
}
