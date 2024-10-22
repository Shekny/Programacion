import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tienda {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\u001B[40m" + "\u001B[32m" + "Bienvenidos a Informasoda donde la Informatica siempre esta de Moda" + "\u001B[0m");
        System.out.println("\u001B[32m");
        System.out.println("\u001B[40m" + "\u001B[32m" +" ___________________________ "+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|                           |"+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|        INFORMASODA        |"+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|           DONDE           |"+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|            LA             |"+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|___________________________|"+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"     |  INFORMATICA  |      "+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"     |     NUNCA     |      "+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"_____|_______________|_____ "+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|          PASA DE          |"+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|           MODA            |"+"\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" +"|___________________________|"+"\u001B[0m");

        
        String Placabase = "Placa base";
        String Grafica = "Grafica";
        String Ram = "Ram";
        String Ventilador = "Ventilador";
        String Pantalla = "Pantalla";
        double PPlacabase = 179.99;
        double PGrafica = 400.89;
        double PRam = 130.59;
        double PVentilador = 180.79;
        double PPantalla = 200.49;
        System.out.println("\u001B[40m" + "\u001B[32m" + "NUESTRO CATALOGO" + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "" + Placabase +"....." + PPlacabase + "€" + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "" + Grafica +"........." + PGrafica + "€" + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "" + Ram +"............." + PRam + "€" + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "" + Ventilador +"......" + PVentilador + "€" + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "" + Pantalla +"........." + PPantalla + "€" + "\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[40m" + "\u001B[32m"+"¿Cuantas Placas base quiere?"+"\u001B[0m");
        int numPlacabase = sc.nextInt();
        System.out.println("\u001B[40m" + "\u001B[32m"+"¿Cuantas Graficas quiere?"+"\u001B[0m");
        int numGrafica = sc.nextInt();
        System.out.println("\u001B[40m" + "\u001B[32m"+"¿Cuanta Memoria Ram quiere?"+"\u001B[0m");
        int numRam  = sc.nextInt();
        System.out.println("\u001B[40m" + "\u001B[32m"+"¿Cuantos Ventiladores quiere?"+"\u001B[0m");
        int numVentilador = sc.nextInt();
        System.out.println("\u001B[40m" + "\u001B[32m" + "¿Cuantas Pantallas quiere?" + "\u001B[0m");
        int numPantalla = sc.nextInt();
        System.out.println("\u001B[40m" + "\u001B[32m" + "Escriba su nombre completo" + "\u001B[0m");
        sc.nextLine();


        Random descuento = new Random();
        int aleatorio = descuento.nextInt(5)+6;
        double totalsinIVA = (numPlacabase * PPlacabase) + (numGrafica * PGrafica) + (numRam * PRam) + (numVentilador * PVentilador)+ (numPantalla * PPantalla);
        double IVA = (21);
        double IVArepercutido = (totalsinIVA * IVA)/100;
        double totalconIVA = (totalsinIVA + IVArepercutido);
        double descuentoaplicado = (totalsinIVA - aleatorio);
        double totalfinal = (totalconIVA - descuentoaplicado);



        String nombrecompleto = sc.nextLine();
        int espacio = nombrecompleto.indexOf(" ");
        String nombre = nombrecompleto.substring(0, espacio);
        String mayusculas = nombrecompleto.toUpperCase();
        String L1 = nombre.toUpperCase().charAt(0) + nombre.substring(1,nombre.length());
        System.out.println("\u001B[40m" + "\u001B[32m" + "Sr/Sra "+ L1 +" aqui tiene su factura" + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "Nombre cliente: " + mayusculas + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "Cantidad de Placas Base: " + numPlacabase + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "Cantidad de Graficas: " + numGrafica + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "Cantidad de Memoria Ram: " + numRam + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "Cantidad de Ventiladores: " + numVentilador + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m" + "Cantidad de Pantallas: " + numPantalla + "\u001B[0m");
        System.out.printf("\u001B[40m" + "\u001B[32m" + "Total sin IVA: %.2f €\u001B[0m \n" , totalsinIVA);
        System.out.println("\u001B[40m" + "\u001B[32m" + "IVA aplicado: 21% " + IVA + "\u001B[0m");
        System.out.printf("\u001B[40m" + "\u001B[32m" + "IVA Repercutido: %.2f €\u001B[0m \n" , IVArepercutido);
        System.out.printf("\u001B[40m" + "\u001B[32m" + "Total con IVA: %.2f €\u001B[0m \n" , totalconIVA);
        System.out.println("\u001B[40m" + "\u001B[32m" + "Descuento por 1ª vez: " + aleatorio + "%" + "\u001B[0m");
        System.out.printf("\u001B[40m" + "\u001B[32m" + "Valor descontado: %.2f €\u001B[0m \n" , descuentoaplicado);
        System.out.printf("\u001B[40m" + "\u001B[32m" + "Total final: %.2f €\u001B[0m \n" , totalfinal);


        System.out.println("\u001B[40m" + "\u001B[32m"+"Gracias por confiar en Informasoda, esperemos que tenga un buen dia y que pueda dsifrutar pronto de su pedido" + "\u001B[0m");
        System.out.println("\u001B[40m" + "\u001B[32m"+"Y recuerde que en Informasoda tanto los precios como la informatica ¡¡¡¡NUNCA PASA DE MODA!!!" + "\u001B[0m");
    }
}