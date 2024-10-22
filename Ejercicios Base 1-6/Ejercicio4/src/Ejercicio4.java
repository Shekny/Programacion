import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio4 {
    private static Object VariableB;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc =new Scanner (System.in);
        System.out.println("A");
        int A = sc.nextInt();
        System.out.println("B");
        int B = sc.nextInt();
        System.out.println("C");
        int C = sc.nextInt();

        int aux = C;
        C = B;
        B = A;
        A = aux;
        System.out.println("Valor de B " +A);
        System.out.println("Valor de C " +B);
        System.out.println("Valor de A " +C);




    }
}