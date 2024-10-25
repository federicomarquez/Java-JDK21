import java.util.Scanner;

public class EjercicioEmpleado {
    public static void main(String[] args) {
        System.out.println("---Registro Empleado---");
        var consola =  new Scanner(System.in);
        System.out.print("proporciona el nombre del empleado: ");
        var nombre = consola.nextLine();
        System.out.print("proporciona la edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("proporciona el sueldo (USD): ");
        var sueldo = Double.parseDouble(consola.nextLine());
        System.out.print("Es un empleado de confianza (true/false): ");
        var empleadoDeConfianza = Boolean.parseBoolean(consola.nextLine());
        System.out.println("los datos ingresados son: ");
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("sueldo = " + sueldo+" USD");
        System.out.println("es empleado de confianza = " + empleadoDeConfianza);

    }
}
