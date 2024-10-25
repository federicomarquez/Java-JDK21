import java.util.Scanner;

public class EstacionDelAñoConSwitch {
    public static void main(String[] args) {
        //decir que mes es dependiendo el numero ingresado (1-12) con switch
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el mes del año: ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otoño";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "Estacion desconocida";
        }
        System.out.println("la estacion en el mes " + mes + " del año es: " + estacion);
    }
}
