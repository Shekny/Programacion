import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Año: ");
        int año = scanner.nextInt();
        int diasEnMes = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasEnMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasEnMes = 30;
                break;
            case 2:

                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    diasEnMes = 29;
                } else {
                    diasEnMes = 28;
                }
                break;
            default:
                diasEnMes = -1;
        }
        if (mes < 1 || mes > 12) {
            System.out.println("El mes es inválido.");
        } else if (dia > 0 && dia <= diasEnMes) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha es inválida.");
        }
    }
}