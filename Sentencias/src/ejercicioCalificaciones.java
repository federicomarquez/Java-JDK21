import java.util.Scanner;

public class ejercicioCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        var calificacion = Integer.parseInt(consola.nextLine());
        var valorLetra = "";
        if (calificacion >= 9 && calificacion <= 10) {
            valorLetra = "A";
        } else if (calificacion >= 8 && calificacion < 9) {
            valorLetra = "B";
        } else if (calificacion >= 7 && calificacion < 8) {
            valorLetra = "C";
        } else if (calificacion >= 6 && calificacion < 7) {
            valorLetra = "D";
        } else if (calificacion >= 0 && calificacion < 6) {
            valorLetra = "F";
        } else {
            valorLetra = "Valor desconocido " + calificacion;
        }
        System.out.println("El valor de la calificacion es: " + valorLetra);
    }
}
