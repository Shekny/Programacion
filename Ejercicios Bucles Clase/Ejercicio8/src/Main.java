import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de numeros a promediar");
        int n = sc.nextInt();
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Dime el numero " +i);
            double num = sc.nextDouble();
            suma += num;
        }
        double promedio = suma/n;
        System.out.println("Promedio es: " +promedio);
    }
}