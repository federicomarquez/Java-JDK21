public class cicloWhileSuma {
    public static void main(String[] args) {
        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        var numero = 0;
        while(acumuladorSuma <= MAXIMO){
            numero += acumuladorSuma;
            acumuladorSuma++;
        }
        System.out.println("suma total de los primeros 5 numeros = " + numero);
    }
}
