import java.util.Scanner;

public class valorDentroDeRango {
    public static void main(String[] args) {
        // definir las variables limites
        final int MINIMO = 0;
        final int MAXIMO = 5;
        //solicitamos en valor entre 0 y 5
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 5:");
        //verificamos
        var dato = Integer.parseInt(consola.nextLine());
        var dentroRAngo = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("dentro de rango = " + dentroRAngo);
    }
}