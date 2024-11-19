package org.example;

public class Electrodomestico {
    public double precioBase;
    public String color;
    public String consumoEnergetico;
    public double peso;

    public Electrodomestico() {
        precioBase = 100;
        color = "blanco";
        consumoEnergetico = "A";
        peso = 10;
    }

    public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = validarConsumo(consumoEnergetico);
        this.peso = peso;
    }

    public double precioFinal() {
        double precio = precioBase;

        if (consumoEnergetico.equals("A+")) precio += 120;
        else if (consumoEnergetico.equals("A")) precio += 100;
        else if (consumoEnergetico.equals("B")) precio += 80;
        else precio += 10;

        if (peso <= 19) precio += 10;
        else if (peso <= 49) precio += 30;
        else if (peso <= 79) precio += 50;
        else precio += 100;

        return precio;
    }

    private String validarConsumo(String consumo) {
        return (consumo.equals("A+") || consumo.equals("A") || consumo.equals("B")) ? consumo : "A";
    }

    public String toString() {
        return "Electrodomestico: " + precioBase + "€, " + color + ", " + consumoEnergetico + ", " + peso + "kg";
    }
}