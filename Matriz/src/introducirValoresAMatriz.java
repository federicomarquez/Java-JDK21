import java.util.Scanner;

public class introducirValoresAMatriz {
    public static void main(String[] args) {
        int renglones, columnas;
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el número de renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el número de columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz = new int[renglones][columnas];
        for (int ren=0; ren< renglones; ren++){
            for(int col=0; col < columnas ; col++){
                System.out.println("Ingresa el valor para la posición ["+ren+"]["+col+"]");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        //iterar los valores de la matriz
        System.out.println();
        for(int ren = 0; ren < renglones ; ren++){
            for(int col = 0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col] + " ");
            }
        }
    }
}
