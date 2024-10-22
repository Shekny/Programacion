import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio13 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia ");
        int dia = sc.nextInt();
        System.out.println("Dime el mes ");
        int mes = sc.nextInt();
        System.out.println("Dime el año ");
        int año = sc.nextInt();
        int suma = dia + mes + año;
        int digito1 = ((suma/1000)%10);
        int digito2 = ((suma/100)%10);
        int digito3 = ((suma/10)%10);
        int digito4 = (suma%10);
        int suma2 = digito1 + digito2 + digito3 + digito4;
        System.out.println("Tu numero de la suerte es " +suma2);
    }
}