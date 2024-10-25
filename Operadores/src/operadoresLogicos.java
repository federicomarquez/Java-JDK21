public class operadoresLogicos {
    public static void main(String[] args) {
        //operadores logicos
        boolean a = true, b = false, resultado = false;
        //operador && "and" (regresa true si ambos son verdaderos)
        resultado = a && b;
        System.out.println(" Resultado operador and, a && b = " + resultado);
        //operador || "ord" (regresa true si alguno es verdadero)
        resultado = a || b;
        System.out.println("Resultado operador or, a || b = " + resultado);
        //operador ^ "xor" (regresa true si solo uno es verdadero)
        resultado = a ^ b;
        System.out.println("Resultado operador XOR a ^ b = " + resultado);
        //operador ! "not" (se invierte el valor booleano)
        resultado = !a;
        System.out.println("Resultado operador not !a = " + resultado);
    }
}
