//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char [] vocal = {'a','b','c','d','e','i','o','u'};
        int contarvocales = 0;

        for (int i = 0; i < vocal.length; i++) {
            if ("aeiou".indexOf(Character.toLowerCase(vocal[i])) != -1) {
                contarvocales++;
            }
        }
        System.out.println("El numero de vocales es: " +contarvocales);
    }
}