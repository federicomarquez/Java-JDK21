public class wjemploSumaFor {
    public static void main(String[] args) {
        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        for(var numero =1; numero <= MAXIMO; numero++){
            System.out.println("acumulador suma -> " + acumuladorSuma + " + "+ numero);
            acumuladorSuma += numero;
            System.out.println("suma parcial acumuladorSuma= " + acumuladorSuma  );
        }
        System.out.println("suma de los primeros 5 numeros = " + acumuladorSuma);
    }
}
