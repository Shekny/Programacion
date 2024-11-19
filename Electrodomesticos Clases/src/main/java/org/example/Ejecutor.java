package org.example;

public class Ejecutor {
    public static void main(String[] args) {

        Lavadora lavadoraAEG = new Lavadora(400, "plateado", "PK", 30, 7); // Consumo PK será A por defecto
        System.out.println(lavadoraAEG);
        System.out.println("Precio final: " + lavadoraAEG.precioFinal() + " €");

        Television tvSamsung = new Television();
        System.out.println(tvSamsung);
        System.out.println("Precio final: " + tvSamsung.precioFinal() + " €");

        tvSamsung = new Television(190, "negro", "A+", 10, 24, true);
        System.out.println(tvSamsung);
        System.out.println("Precio final: " + tvSamsung.precioFinal() + " €");
    }
}