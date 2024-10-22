import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador 1, elige: piedra, papel, tijera, lagarto o Spock:");
        String jugador1 = scanner.nextLine().toLowerCase();
        System.out.println("Jugador 2, elige: piedra, papel, tijera, lagarto o Spock:");
        String jugador2 = scanner.nextLine().toLowerCase();

        switch (jugador1) {
            case "piedra":
                switch (jugador2) {
                    case "tijera":
                    case "lagarto":
                        System.out.println("Jugador 1 gana. Piedra gana a " + jugador2);
                        break;
                    case "piedra":
                        System.out.println("Empate.");
                        break;
                    default:
                        System.out.println("Jugador 2 gana. " + jugador2 + " gana a piedra");
                        break;
                }
                break;
            case "papel":
                switch (jugador2) {
                    case "piedra":
                    case "spock":
                        System.out.println("Jugador 1 gana. Papel gana a " + jugador2);
                        break;
                    case "papel":
                        System.out.println("Empate.");
                        break;
                    default:
                        System.out.println("Jugador 2 gana. " + jugador2 + " gana a papel");
                        break;
                }
                break;
            case "tijera":
                switch (jugador2) {
                    case "papel":
                    case "lagarto":
                        System.out.println("Jugador 1 gana. Tijera gana a " + jugador2);
                        break;
                    case "tijera":
                        System.out.println("Empate.");
                        break;
                    default:
                        System.out.println("Jugador 2 gana. " + jugador2 + " gana a tijera");
                        break;
                }
                break;
            case "lagarto":
                switch (jugador2) {
                    case "spock":
                    case "papel":
                        System.out.println("Jugador 1 gana. Lagarto gana a " + jugador2);
                        break;
                    case "lagarto":
                        System.out.println("Empate.");
                        break;
                    default:
                        System.out.println("Jugador 2 gana. " + jugador2 + " gana a lagarto");
                        break;
                }
                break;
            case "spock":
                switch (jugador2) {
                    case "tijera":
                    case "piedra":
                        System.out.println("Jugador 1 gana. Spock gana a " + jugador2);
                        break;
                    case "spock":
                        System.out.println("Empate.");
                        break;
                    default:
                        System.out.println("Jugador 2 gana. " + jugador2 + " gana a Spock");
                        break;
                }
                break;
            default:
                System.out.println("Elección no válida de Jugador 1.");
                break;
        }
    }
}