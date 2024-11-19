public class Ejecutor {
    public static void main(String[] args) {

        Tienda producto1 = new Tienda("Impresora HP", 100.0, 21.0, 5.0);
        Tienda producto2 = new Tienda("Ratón Logitech");
        Tienda producto3 = new Tienda("Libro Java", 20.0, 4.0, 15.0);

        System.out.println("Datos iniciales de los productos:");
        producto1.calcularPrecio();
        producto2.calcularPrecio();
        producto3.calcularPrecio();

        System.out.println("Número de productos: " + Tienda.numeroProductos);

        Tienda.establecerDescuentoGlobal(10.0);
        System.out.println("Se aplica un descuento global del 10% (Black Friday)");

        producto2.precio = 12.0;

        System.out.println("Datos actualizados de los productos:");
        producto1.calcularPrecio();
        producto2.calcularPrecio();
        producto3.calcularPrecio();

        System.out.println("Número de productos: " + Tienda.numeroProductos);
    }
}