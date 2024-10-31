import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero");
        int num = sc.nextInt();
        long factorial = 1;
        for (int i=1;i<=num;i++)
        {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
    }
}