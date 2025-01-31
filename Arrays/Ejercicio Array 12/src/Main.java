//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.public class Main {
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Pares: ");
        for (int num : numeros) {
            if (num % 2 == 0) System.out.print(num + " ");
        }

        System.out.print("\nImpares: ");
        for (int num : numeros) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
    }
}