import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio11 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el valor de X");
        int x = sc.nextInt();
        int resultado = (x*x*x*x*x)+(7*x*x*x*x)-(4*x*x*x)+(2*x*x)-(x)+(10);
        System.out.println("Resultado " +resultado);
    }
}