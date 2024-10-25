import java.text.DecimalFormat;
import java.util.Random;

public class generadorDeID {
    public static void main(String[] args) {
        generadorIdUnico();

    }
    static void generadorIdUnico(){
        var consola = new java.util.Scanner(System.in);
        //pido nombre y tomo solo ultimas dos letras y convierto en mayuscula
        System.out.print("Ingrese su nombre = ");
        var nombre = consola.nextLine();
        var subcadena = nombre.substring(0,2).toUpperCase();
        //pido apellido y tomo solo ultimas dos letras y convierto en mayuscula
        System.out.print("Ingrese su apellido = ");
        var apellido = consola.nextLine();
        var subcadena2 = apellido.substring(0,2).toUpperCase();
        //pido año y lo convierto para que solo me de los ultimo 2 digitos
        System.out.print("Ingrese el año de nacimiento = ");
        var año = Integer.parseInt(consola.nextLine());
        String conversorParaID = String.valueOf(año).substring(2,4);
        //genero numero aleatorio le doy formato "####" y solo tomo 4 digitos para generar ID
        var aleatorios = new Random();
        int valorAleatorio = aleatorios.nextInt(1000,9999);
        var patron = "####";
        var decimalFormat = new DecimalFormat(patron);
        var numeroFormato = decimalFormat.format(valorAleatorio);
        //imprimo el ID:
        System.out.print("su ID es = " + subcadena + subcadena2 + conversorParaID + numeroFormato);

    }
}
        //cosas que hace el profe que podemos rescatar para mejorar el codigo
        //System.out.println("*** Generador ID Unico ***");
        //var consola = new Scanner(System.in);
        //System.out.print("Cual es tu nombre? ");
        //var nombre = consola.nextLine().substring(0,2).toUpperCase();
        //System.out.print("Cual es tu apellido? ");
        //var apellido = consola.nextLine().substring(0,2).toUpperCase();
        //System.out.print("Cual es tu año de nacimiento (YYYY)? ");
        //var anio = consola.nextLine().substring(2,4);
        //var aleatorio = new Random().nextInt(0, 9999);
        //var valorAleatorio = new DecimalFormat("####").format(aleatorio);
        //var idUnico = nombre + apellido + anio + valorAleatorio;
        //System.out.println("Felicidades! tu nuevo numero de ID Unico es: " + idUnico);