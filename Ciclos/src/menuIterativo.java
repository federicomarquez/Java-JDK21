import java.util.Scanner;

public class menuIterativo {
    public static void main(String[] args) {
        //menu iterativo
        System.out.println("sistema de administracion de cuentas");
        var salir = false;
        while(!salir){
            System.out.print("""
                Menu:
                1. Crear cuenta
                2. eliminar cuenta
                3. salir del sistema
                escige una opcion: \s """);
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch(opcion){
                case 1 -> System.out.println("creando cuenta...");
                case 2 -> System.out.println("eliminando cuenta...");
                case 3 -> {
                    System.out.println("saliendo del sistema");
                    salir = true;
                }
                default -> System.out.println("opcion no valida " + opcion);
            }
            System.out.println();
        }
    }
}
