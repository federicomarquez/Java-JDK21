public class operadorAsignacion {
    public static void main(String[] args) {
        //operador de asignacion
        int a = 3, b = 2, c = 1, resultado = 0;
        //asignacion simple
        resultado = a + b;
        System.out.println("resultado = " + resultado);
        //asignacion con suma
        resultado += a;
        System.out.println("resultado += a = " + resultado);
        //asignacion con resta
        resultado -= a;
        System.out.println("resultado -= a = " + resultado);
        //asignacion con multiplicacion
        resultado *= a;
        System.out.println("resultado *= a = " + resultado);
        //asignacion con division
        resultado /= a;
        System.out.println("resultado /= a = " + resultado);
        //asignacion con modulo
        resultado %= a;
        System.out.println("resultado %= a = " + resultado);
        //asignacion con AND
        resultado &= a;
        System.out.println("resultado &= a = " + resultado);
        //asignacion con OR
        resultado |= a;
        System.out.println("resultado |= a = " + resultado);
        //asignacion con XOR
        resultado ^= a;
        System.out.println("resultado ^= a = " + resultado);
        //asignacion con corrimiento a la izquierda
        resultado <<= a;
        System.out.println("resultado <<= a = " + resultado);
        //asignacion con corrimiento a la derecha
        resultado >>= a;
        System.out.println("resultado >>= a = " + resultado);
        //asignacion con corrimiento a la derecha sin signo
        resultado >>>= a;
        System.out.println("resultado >>>= a = " + resultado);
    }
}
