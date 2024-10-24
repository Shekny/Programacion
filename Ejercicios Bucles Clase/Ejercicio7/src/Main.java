//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int sumapares = 0;
        int sumaimpares = 0;
        for (int i=2;i < 100;i+=2)
        {
            sumapares += i;
        }
        for (int i=1;i < 100;i+=2)
        {
            sumaimpares += i;
        }
        System.out.println("Numeros Pares:" +sumapares);
        System.out.println("Numeros Impares: " +sumaimpares);
    }
}