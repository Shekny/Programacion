import java.io.*;

public class CopiarCSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
             FileWriter writer = new FileWriter("copia_datos.csv")) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
            }
            System.out.println("El contenido se copio a copia_datos.csv ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al copiar el archivo ");
        }
    }
}