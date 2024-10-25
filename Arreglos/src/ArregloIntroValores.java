import java.util.Scanner;

public class ArregloIntroValores {
    public static void main(String[] args) {
        //intrducir valores en un arreglo
        var consola = new Scanner(System.in);
        //solicitar la cantidad de elementos
        System.out.print("Cuántos elementos va a tener el arreglo = ");
        var cantidad = Integer.parseInt(consola.nextLine());
        //crear el arreglo
        int[] enteros = new int[cantidad];
        //solicitar los valores al usuario
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());

        }

        //imprimir los valores
        System.out.print("\n Impresión de los valores: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("enteros[" + i + "]  = " + enteros[i]);
        }
    }
}
