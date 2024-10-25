public class cicloDoWhileSuma {
    public static void main(String[] args) {
        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        var numero = 0;
        do{
            numero += acumuladorSuma;
            acumuladorSuma++;
        }while(acumuladorSuma <= MAXIMO);
        System.out.println("suma total de los primeros 5 numeros = " + numero);
    }
}
