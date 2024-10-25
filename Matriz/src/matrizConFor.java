public class matrizConFor {
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
        //accedemos los renglones
        for(int ren = 0 ; ren < RENGLONES ; ren++){
            //recorrer las columnas ( del renglon en ese momento)
            for(int col = 0 ; col < COLUMNAS; col++)
                System.out.println("valor["+ren+"]["+col+"] = " + matriz[ren][col]);
        }
    }
}
