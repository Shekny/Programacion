import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SobreescribirCSV {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("datos.csv")) {
            Scanner scanner = new Scanner(System.in);
            String opcion;

            do {
                System.out.print("Ingresa nombre : ");
                String nombre = scanner.nextLine();
                System.out.print("Ingresa edad : ");
                String edad = scanner.nextLine();
                System.out.print("Ingresa ciudad : ");
                String ciudad = scanner.nextLine();

                writer.write(nombre + "-" + edad + "-" + ciudad);
                System.out.print("¿Quieres agregar otra línea? (sí/no) : ");
                opcion = scanner.nextLine();
            } while (opcion.equalsIgnoreCase("sí"));

            System.out.println("El archivo datos.csv fue sobrescrito con nuevos datos ");
        } catch (IOException e) {
            System.out.println("Algo salio mal al sobrescribir el archivo ");
        }
    }
}