import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEjemplos {
    public static void main(String[] args) {

        // Ejemplo 1: Crear y recorrer una lista
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");

        // Mostrar la lista
        System.out.println("Ejemplo 1: Lista de frutas");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Ejemplo 2: Añadir en una posición específica
        frutas.add(1, "Naranja"); // Añade "Naranja" en la posición 1
        System.out.println("\nEjemplo 2: Lista después de añadir Naranja en la posición 1");
        System.out.println(frutas);

        // Ejemplo 3: Eliminar un elemento por índice o por valor
        frutas.remove(2); // Elimina el elemento en el índice 2 ("Banana")
        frutas.remove("Cereza"); // Elimina "Cereza" directamente
        System.out.println("\nEjemplo 3: Lista después de eliminar elementos");
        System.out.println(frutas);

        // Ejemplo 4: Buscar un elemento en la lista
        boolean contieneManzana = frutas.contains("Manzana");
        System.out.println("\nEjemplo 4: ¿La lista contiene Manzana? " + contieneManzana);

        // Ejemplo 5: Ordenar la lista
        frutas.add("Kiwi");
        frutas.add("Pera");
        Collections.sort(frutas); // Ordena alfabéticamente
        System.out.println("\nEjemplo 5: Lista ordenada alfabéticamente");
        System.out.println(frutas);

        // Ejemplo 6: Limpiar la lista
        frutas.clear(); // Elimina todos los elementos de la lista
        System.out.println("\nEjemplo 6: Lista después de usar clear()");
        System.out.println(frutas);
    }
}