import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tipo de cliente (Regular, Premium, VIP): ");
        String cliente = scanner.next().toLowerCase();
        double descuento = 0;

        if (cliente.equals("regular")) {
            descuento = 0.05;
        } else if (cliente.equals("premium")) {
            descuento = 0.10;
        } else if (cliente.equals("vip")) {
            descuento = 0.20;
            if (precio > 500) {
                descuento += 0.05;
            }
        } else {
            System.out.println("Error.");
            scanner.close();
            return;
        }
        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final con descuento es: " + precioFinal);
        }
    }