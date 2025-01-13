import java.io.File;
import java.util.Scanner;

public class EliminarArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivo2.txt ");

        if (archivo.exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Deseas eliminar el archivo archivo2.txt? (sí/no) : ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("sí")) {
                if (archivo.delete()) {
                    System.out.println("El archivo fue eliminado con éxito ");
                } else {
                    System.out.println("No se pudo eliminar el archivo ");
                }
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("No se eliminó el archivo.");
            }
        }
    }
}