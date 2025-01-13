import java.io.*;

public class CopiarArchivo {
    public static void main(String[] args) {
        try (BufferedReader lector = new BufferedReader(new FileReader("archivo1.txt"));
             FileWriter escritor = new FileWriter("archivo2.txt")) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                escritor.write(linea + "\n");
            }
            System.out.println("El contenido se copio a archivo2.txt con exito");
        } catch (IOException e) {
            System.out.println("Algo salio mal al copiar el archivo : " + e.getMessage());
        }
    }
}