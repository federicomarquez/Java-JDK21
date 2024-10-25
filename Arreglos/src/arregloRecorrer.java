public class arregloRecorrer {
    public static void main(String[] args) {
        int[] enteros = {100, 200, 300, 400, 500};
        //recorrer el arreglo
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("valor del indice " + i + " = " + enteros[i]);
            System.out.println("valor " + (i + 1) + " = " + enteros[i]);
        }
    }
}
