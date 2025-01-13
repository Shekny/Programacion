import java.io.*;

public class Generar18CSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
             FileWriter writer = new FileWriter("adultos.csv")) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                int edad = Integer.parseInt(campos[1]);
                if (edad >= 18) {
                    writer.write(linea);
                }
            }
            System.out.println("El archivo adultos.csv fue generado ");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Algo salio mal al procesar los datos ");
        }
    }
}