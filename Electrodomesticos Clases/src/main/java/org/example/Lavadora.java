package org.example;

public class Lavadora extends Electrodomestico {
    public double carga;

    public Lavadora() {
        super();
        carga = 5;
    }

    public Lavadora(double precioBase, String color, String consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 6) {
            precio += 50;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lavadora, carga: " + carga + "kg";
    }
}