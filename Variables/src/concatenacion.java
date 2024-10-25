import java.util.Scanner;

public class concatenacion { //psvm
    public static void main(String[] args) {
        //concatenacion
//        var nombre = "karla";
//        var apellido = "Lara";
//        var nombreCompleto = nombre + " " + apellido;
//        System.out.println("nombreCompleto = " + nombreCompleto);
        //ingresar variables por usuario
        var consola = new Scanner(System.in);  //in - input -entrada de datos
        System.out.println("escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
