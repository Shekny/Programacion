import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime el numero");
        int num1 = sc.nextInt();
        System.out.println("Dime el numero");
        int num2 = sc.nextInt();
        System.out.println("Dime el numero");
        int num3 = sc.nextInt();
        System.out.println("Dime el numero");
        int num4 = sc.nextInt();
        int multiplicacion = num1 * num2 * num3 * num4;
        System.out.println("Resultado multiplicacion es "+ multiplicacion);
        int suma = num1 + num2 + num3 + num4;
        System.out.println("Resultado suma es "+ suma);
        double aritmetica = (num1 + num2 + num3 + num4)/4;
        System.out.println("Resultado aritmetico es "+aritmetica);

    }
}