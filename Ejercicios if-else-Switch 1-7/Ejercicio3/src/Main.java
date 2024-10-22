import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota5;
        System.out.print("Ingrese la nota de la materia 1: ");
        nota1 = scanner.nextDouble();
        System.out.print("Ingrese la nota de la materia 2: ");
        nota2 = scanner.nextDouble();
        System.out.print("Ingrese la nota de la materia 3: ");
        nota3 = scanner.nextDouble();
        System.out.print("Ingrese la nota de la materia 4: ");
        nota4 = scanner.nextDouble();
        System.out.print("Ingrese la nota de la materia 5: ");
        nota5 = scanner.nextDouble();

        if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100 || nota4 < 0 || nota4 > 100 || nota5 < 0 || nota5 > 100) {
            System.out.println("Error");
        } else {
            double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
            System.out.println("El promedio es: " + promedio);
            if (promedio >= 90) {
                System.out.println("A");
            } else if (promedio >= 80) {
                System.out.println("B");
            } else if (promedio >= 70) {
                System.out.println("C");
            } else if (promedio >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}