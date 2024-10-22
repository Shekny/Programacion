import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio12 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la hora ");
        int horas1 = sc.nextInt();
        System.out.println("Dime los minutos ");
        int minutos1 = sc.nextInt();
        System.out.println("Dime los segundos ");
        int segundos1 = sc.nextInt();

        System.out.println("Dime la hora ");
        int horas2 = sc.nextInt();
        System.out.println("Dime los minutos ");
        int minutos2 = sc.nextInt();
        System.out.println("Dime los segundos ");
        int segundos2 = sc.nextInt();

        int resultado1 = (horas1*3600)+(minutos1*60)+(segundos1);
        int resultado2 = (horas2*3600)+(minutos2*60)+(segundos2);
        int resultado3 = (resultado2-resultado1);
        System.out.println("Resultado 3 " +resultado3);
        int horatotal = (resultado3/3600);
        int minutostotales = ((resultado3%3600)/60);
        int segundostotales = (resultado3%60);
        System.out.println("La diferencia de tiempo es " +horatotal +" Horatotal " +minutostotales +" Minutostotales " +segundostotales +" Segundostotales ");

    }
}