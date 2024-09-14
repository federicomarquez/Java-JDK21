public class AritmeticaThis {
    int operando1;
    int operando2;

    // 2 constructores vacio y con parametros
    public AritmeticaThis(){

    }

    public AritmeticaThis(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operandor this = " + this);
    }

    void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Restulado suma = " + resultado);
    }

    void restar(){
        int resultado = operando1 - operando2;
        System.out.println("resultado Resta = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("ejemplo aritmetica");
        var aritmetica1 = new AritmeticaThis(5,7);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("Dir.Memoria " + aritmetica1);
        var aritmetica2 = new AritmeticaThis(12, 16);
        aritmetica2.sumar();
        System.out.println("Dir. memoria 2 " + aritmetica2 );

    }
}
