import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirCSV {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("datos.csv")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa nombre : ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa edad : ");
            String edad = scanner.nextLine();
            System.out.print("Ingresa ciudad : ");
            String ciudad = scanner.nextLine();

            writer.write(nombre+ "-" + edad + "-" + ciudad);
            System.out.println("Datos escritos en el archivo datos.csv ");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo ");
        }
    }
}