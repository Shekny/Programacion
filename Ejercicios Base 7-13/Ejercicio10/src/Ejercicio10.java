import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio10 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del alumno");
        String cadena = sc.nextLine();

        System.out.println("Practica");
        double practica = sc.nextDouble();
        System.out.println("Problemas");
        double problemas = sc.nextDouble();
        System.out.println("Teoria");
        double teoria = sc.nextDouble();
        double nota = (practica*0.1) + (problemas*0.5) + (teoria*0.4);
        System.out.println("La nota de " +cadena + " es " +nota);

    }
}