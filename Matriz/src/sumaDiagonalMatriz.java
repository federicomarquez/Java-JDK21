public class sumaDiagonalMatriz {
    public static void main(String[] args) {
        //matriz
        final int RENGLONES = 3;
        final int COLUMNAS = 3;
        var suma = 0;
        //definimos la matriz
        int[][] matriz = new int[RENGLONES][COLUMNAS];
        //llenar matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;
        //accedemos a los valores
        for(int col = 0; col < COLUMNAS; col++){
            for(int ren =0; ren < RENGLONES; ren++){
                if(ren == col){
                    suma += matriz[ren][col];

                }
            }
        }
        System.out.println("la suma de la diagonal de la matriz: " + suma);
    }
}
