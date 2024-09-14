public class SobreCargaConstructores {
    int operando1;
    int operando2;

    // 2 constructores vacio y con parametros
    public SobreCargaConstructores(){

    }

    public SobreCargaConstructores(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
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
        var aritmetica1 = new SobreCargaConstructores(5,7);
        aritmetica1.sumar();
        aritmetica1.restar();
        var aritmetica2 = new SobreCargaConstructores();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
    }
}
