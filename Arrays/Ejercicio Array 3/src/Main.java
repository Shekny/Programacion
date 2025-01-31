//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numero = {1,2,3,4,5,6};
        int mayor = numero [0];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]>mayor){
                mayor = numero[i];
            }
        }
        System.out.println("El numero mayor es " +mayor);
    }
}