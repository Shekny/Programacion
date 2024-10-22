import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tus ingresos anuales: ");
        double ingresos = scanner.nextDouble();
        System.out.print("Ingresa el número de dependientes: ");
        int dependientes = scanner.nextInt();
        double porcentajeImpuesto = 0;

        if (ingresos < 20000) {
            porcentajeImpuesto = 5;
        } else if (ingresos >= 20000 && ingresos <= 40000) {
            porcentajeImpuesto = 10;
        } else if (ingresos > 40000 && ingresos <= 80000) {
            porcentajeImpuesto = 20;
        } else {
            porcentajeImpuesto = 30;
        }
        if (dependientes > 3) {
            porcentajeImpuesto -= 5;
        }
        double impuesto = ingresos * (porcentajeImpuesto / 100);
        System.out.printf("Tu impuesto total es: %.2f €" , impuesto);
    }
}