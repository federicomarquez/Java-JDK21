public class declararMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {100,200,300},
                {400,500,600}
        };


        //recorrer los renglones
        for(int ren = 0 ; ren < matriz.length ; ren++){
            //recorrer las columnas ( del renglon en ese momento)
            for(int col = 0 ; col < matriz[ren].length; col++)
                System.out.println("valor["+ren+"]["+col+"] = " + matriz[ren][col]);
        }



    }
}
