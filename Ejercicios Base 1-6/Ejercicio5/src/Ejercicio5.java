import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio5 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Segundos");
        int segundos1 = sc.nextInt();
        int Horas = (segundos1 / 3600);
        System.out.println("Horas " +Horas);
        int Minutos = ((segundos1 - Horas * 3600)/60);
        System.out.println("Minutos " +Minutos);
        int Segundos = segundos1 - (Horas * 3600 + Minutos * 60);
        System.out.println("Segundos " +Segundos);


    }
}