package Ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE VENTAS ***");
        var camisa1 = new Producto("camisa", 50.00);
        System.out.println(camisa1);
        var pantalon1 = new Producto("Pantalon", 100.00);
        System.out.println(pantalon1);
        // primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(camisa1);
        orden1.agregarProducto(pantalon1);
        orden1.mostrarOrden();
        //segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("calcetines", 20.00));
        orden2.agregarProducto(camisa1);
        orden2.mostrarOrden();
    }
}
