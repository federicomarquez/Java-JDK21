import java.util.Scanner;

public class ArregloEjercicioCali {
    public static void main(String[] args) {
        //pedir cantidad de calificaciones
        var consola = new Scanner(System.in);
        System.out.print("¿Cuántas calificaciones vas a ingresar? ");
        var cantidad = Integer.parseInt(consola.nextLine());
        int[] calificaciones = new int[cantidad];
        //pedir las calificaciones
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Proporciona la calificación " + (i + 1) + ": ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        //imprimir promedio de calificaciones
        var suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += calificaciones [i];
        }
        var promedio = suma / cantidad;
        System.out.println("Promedio: " + promedio);

    }
}
