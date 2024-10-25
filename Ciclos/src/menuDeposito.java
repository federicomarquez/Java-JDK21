import java.util.Scanner;

public class menuDeposito {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al cajero ***");
        var salir = false;
        var saldo = 1000.0;
        var console = new Scanner(System.in);
        while(!salir){
            System.out.print("""
                    Menu:
                    1.Consultar saldo
                    2.Retirar saldo
                    3.Ingresar saldo
                    4.salir
                    ingrese su opcion:
                    """);
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch(opcion){
                case 1 ->
                    System.out.println("su saldo es = " + "$"+saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar = ");
                    var retirar = Float.parseFloat(console.nextLine());
                    saldo -= retirar;
                    System.out.println("su salgo actual es de = " +"$"+saldo);
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a ingresar = ");
                    var ingresar = Float.parseFloat(console.nextLine());
                    saldo += ingresar;
                    System.out.println("su salgo actual es de = " +"$"+saldo);
                }
                case 4 -> {
                    salir = true;
                    System.out.println("*** Saliendo del sistema... Hasta luego ***");
                }
            }
        }
    }
}
