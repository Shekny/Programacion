public class Tienda {
    public String producto;
    public double precio;
    public double iva;
    public double descuento;
    public static int numeroProductos = 0;
    public static double descuentoGlobal = 0;

    public Tienda(String producto, double precio, double iva, double descuento) {
        this.producto = producto;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        numeroProductos++;
    }

    public Tienda(String producto) {
        this.producto = producto;
        this.precio = 10.0;
        this.iva = 21.0;
        this.descuento = 0.0;
        numeroProductos++;
    }

    public void calcularPrecio() {
        double descuentoAplicado;
        if (this.descuento > descuentoGlobal) {
            descuentoAplicado = this.descuento;
        } else {
            descuentoAplicado = descuentoGlobal;
        }

        double precioConDescuento = this.precio - (this.precio * (descuentoAplicado / 100));

        double precioFinal = precioConDescuento + (precioConDescuento * (this.iva / 100));

        System.out.println("Producto: " + this.producto + ", Precio final: " + precioFinal + " Euros");
    }

    public String toString() {
        return "Producto: " + this.producto + ", Precio: " + this.precio + " Euros.";
    }

    public static void establecerDescuentoGlobal(double nuevoDescuento) {
        descuentoGlobal = nuevoDescuento;
    }
}
