//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Múltiplos de 5 entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "Los Multiplos son ");
            }
        }
    }
}