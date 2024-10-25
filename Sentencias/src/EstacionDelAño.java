import java.util.Scanner;

public class EstacionDelAño {
    public static void main(String[] args) {
        //decir que mes es dependiendo el numero ingresado (1-12)
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el mes del año: ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otoño";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Primavera";
        } else {
            estacion = "Estacion desconocida";
        }
        System.out.println("la estacion del año es: " + estacion);
    }
}
