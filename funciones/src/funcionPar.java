import java.sql.SQLOutput;
import java.util.Scanner;

public class funcionPar {

    //funcion para saber si un numero es par
    static boolean esPar(int numero){
        return(numero % 2 == 0)? true : false;

        //if(numero % 2 == 0)
        //    return true;
        //else
        //    return false;
    }


    public static void main(String[] args) {
        System.out.print("ingrese un valor numero: ");
        var consola = new Scanner(System.in);
        var numero = Integer.parseInt(consola.nextLine());
        System.out.print("numero par? " + esPar(numero));
    }
}
