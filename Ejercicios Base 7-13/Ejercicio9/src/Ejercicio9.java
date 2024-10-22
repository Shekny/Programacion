import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio9 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Partidos Ganados");
        int ganados = sc.nextInt();
        System.out.println("Partidos Perdidos");
        int perdidos = sc.nextInt();
        System.out.println("Partidos Empatados");
        int empatados = sc.nextInt();
        int puntos = (ganados * 3) + (empatados * 1) + (perdidos * 0);
        System.out.println("Puntuacion total " +puntos);
    }
}