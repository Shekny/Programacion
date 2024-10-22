import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio6 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de 5 digitos");
        int num = sc.nextInt();

        if (num<10000|| num>99999){
            System.out.println("Error, El numero tiene que tener 5 digitos");
        }
        else{
        int digito1 = num/10000;
        System.out.println("El digito1 es " +digito1);
        int digito2 = (num/1000)%10;
        System.out.println("El Digito2 es " +digito2);
        int digito3 = (num/100)%10;
        System.out.println("El digito3 es " +digito3);
        int digito4 = (num/10)%10;
        System.out.println("El digito4 es " +digito4);
        int digito5 = num%10;
        System.out.println("El digito5 es " +digito5);

        }
    }
}