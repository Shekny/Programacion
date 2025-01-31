//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] palabras = {"oso", "casa", "reconocer", "java", "radar"};

        for (String palabra : palabras) {
            String invertida = "";
            for (int i = palabra.length() - 1; i >= 0; i--) {
                invertida += palabra.charAt(i);
            }

            if (palabra.equalsIgnoreCase(invertida)) {
                System.out.println(palabra + " es un palíndromo");
            } else {
                System.out.println(palabra + " no es un palíndromo");
            }
        }
    }
}