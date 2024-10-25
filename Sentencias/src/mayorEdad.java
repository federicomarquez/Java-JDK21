import java.util.Scanner;

public class mayorEdad {
    public static void main(String[] args) {
        final var MAYOR_EDAD = 18;
        System.out.println("ingrese su edad: ");
        var edad = Integer.parseInt(new Scanner(System.in).nextLine());
        //validamos la edad
        if (edad >= MAYOR_EDAD) {
            System.out.println("La persona con edad " + edad + " es mayor de edad");
        }else{
            System.out.println("La persona con edad " + edad + " es menor de edad");
        }
    }
}
