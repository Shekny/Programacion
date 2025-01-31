//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] enteros = {1,2,3,4,5,6,7,8,9,10};
        boolean ascenso = true;

        for (int i = 0; i < enteros.length -1; i++) {
            if (enteros[i] > enteros[i + 1]) {
                ascenso = false;
                break;
            }
        }

        if (ascenso) {
            System.out.println("Estan en orden ascendente");

        }else{
            System.out.println("No estan en orden ascendente");
        }
    }
}