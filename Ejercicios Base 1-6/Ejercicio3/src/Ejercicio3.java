import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio3 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc =new Scanner (System.in);
        System.out.println("Numero de ventas de ropa");
        int ropa = sc.nextInt();
        System.out.println("Numero de ventas de productos electronicos");
        int productoselectronicos = sc.nextInt();
        int suma = ropa + productoselectronicos;
        System.out.println("Resultado de ventas total " +suma);
        double porcentaje1 = (ropa * 100)/suma;
        System.out.println("Resultado de porcentaje ropa es "+ porcentaje1);
        double porcentaje2 = (productoselectronicos * 100)/suma;
        System.out.println("Resultado de porcentaje productos electronicos es "+ porcentaje2);

    }
}