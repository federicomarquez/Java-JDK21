public class Constructor {
    int operando1;
    int operando2;

    //constructor
    public Constructor(int op1, int op2){
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
        var aritmetica1 = new Constructor(5,7);
        //aritmetica1.operando1 = 5;
        //aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.restar();

    }
}
