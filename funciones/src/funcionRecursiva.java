public class funcionRecursiva {

    static void funcionRecursiva(int numero) {
        //caso base
        if (numero == 1)
            System.out.print(numero);
        else {
            //caso recursivo
            System.out.print(numero + " ");
            funcionRecursiva(numero - 1);
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
