public class sentenciaDecision {
    public static void main(String[] args) {
        //revisar si un numero es positivo /negatico / cero
        var consola = new java.util.Scanner(System.in);
        System.out.println("Proporciona el numero: ");
        var numero = Integer.parseInt(consola.nextLine());
        if (numero > 0) {
            System.out.println("El numero es positivo" + numero);
        } else if (numero < 0) {
            System.out.println("El numero es negativo" + numero);
        } else {
            System.out.println("El numero es cero" + numero);
        }
    }
}
