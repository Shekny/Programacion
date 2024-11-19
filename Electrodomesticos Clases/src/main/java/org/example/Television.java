package org.example;

public class Television extends Electrodomestico {
    public int resolucion;
    public boolean netflix;

    public Television() {
        super();
        resolucion = 20;
        netflix = false;
    }

    public Television(double precioBase, String color, String consumoEnergetico, double peso, int resolucion, boolean netflix) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 20) {
            precio += precioBase * 0.30;
        }
        if (netflix) {
            precio += 60;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Television, resolucion: " + resolucion + " pulgadas, Netflix: " + netflix;
    }
}