import javax.swing.*;
import java.util.Scanner;

public class generadorEmail {
    public static void main(String[] args) {
        generadorEmails();
    }
    static void generadorEmails() {
        System.out.println("***### GENERADOR DE EMAIL ###***");
        var consola = new Scanner(System.in);
        System.out.print("ingrese su nombre = ");
        var nombre = consola.nextLine().toLowerCase();
        System.out.print("ingresa tu apellido = ");
        var apellido = consola.nextLine().toLowerCase();
        var generarEmail = nombre + "." + apellido + "@globalMentoring.com.x" ;
        System.out.print("su email generado es = " +generarEmail);
    }
}
