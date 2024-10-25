public class matriz {
    public static void main(String[] args) {
        //matriz
        final int RENGLONES = 2;
        final int COLUMNAS = 3;
        //definimos la matriz
        int[][] matriz = new int[RENGLONES][COLUMNAS];
        //llenar matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        //accedemos a los valores
        System.out.println("valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("valor 2 [0][1] = " + matriz[0][1]);
        System.out.println("valor 6 [1][2]) = " + matriz[1][2]);
    }
}
