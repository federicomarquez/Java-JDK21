import java.util.Scanner;

public class presentacion {
    public static void main(String[] args) {
        //presentacion
        System.out.println("presetancion");
        System.out.print("ingresa tu nombre: ");
        var consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.print("ingresa tu edad: ");
        var edad = consola.nextLine();
        System.out.print("era hijo unico ? (True/False): ");
        var hijoUnico = consola.nextLine();
        System.out.print("cual es tu bebida favorita: ");
        var BebidaF = consola.nextLine();
        System.out.print("cual es el precio de tu bebida favorita: ");
        var precio = consola.nextLine();
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + Integer.parseInt(edad));
        System.out.println("hijoUnico = " + Boolean.parseBoolean(hijoUnico));
        System.out.println("BebidaF = " + BebidaF);
        System.out.println("precio de la bebida = " + Float.parseFloat(precio));
        
    }
}
