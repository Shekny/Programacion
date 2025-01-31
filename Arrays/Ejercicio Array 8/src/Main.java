//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char [] cadena = {'a','a','a','b','g','y','w'};
        char c = 'a';
        int contador = 0;

        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == c)
                contador++;
        }
        System.out.println("El carácter " +c + "aparece " + contador + "veces");
    }
}