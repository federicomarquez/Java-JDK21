import java.util.Random;

public class funcionRandom {
    public static void main(String[] args) {
        //funcion numeros aleatorios
        var aleatorios = new Random();
        //generar los valores entre 0 y 100 ( no se incluye el valor limite)
        int valorAleatorio = aleatorios.nextInt(0, 100+1);
        System.out.println("valor Aleatorio entre 0 y 100 = " + valorAleatorio);
        valorAleatorio = aleatorios.nextInt(100, 201);
        System.out.println("valor Aleatorio 2 entre 100 y 200 = " + valorAleatorio);
        int min = 100, max = 200;
        valorAleatorio = aleatorios.nextInt(min, max + 1);
        System.out.println("valor aleatorio 3 entre 100 y 200 = " + valorAleatorio);

    }
}
