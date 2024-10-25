public class operadoresUnirios {
    public static void main(String[] args) {
        //operadores unarios
        int a = 3, b = -2, resultado = 0;
        //var c = true;
        // Operador unicario -
        resultado = -a;
        System.out.println("-a = " + resultado);
        resultado = -b;
        System.out.println("-b = " + resultado);
        //operador incremento ++
        a = 3;
        resultado = ++a;
        System.out.println("pre incremento ++a = " + resultado);
        a = 3;
        resultado = a++; //post incremento
        System.out.println("post incremento a++ = " + resultado);
        System.out.println("a = " + a);
        //decremento --
        b = -2;
        resultado = --b; //pre decremento
        System.out.println("pre decremento --b = " + resultado);
        b = -2;
        resultado = b--; //post decremento
        System.out.println("post decremento b-- = " + resultado);
        System.out.println("b = " + b);
        //operador logico ! ( se invierte el valor booleano)
        var c = true;
        var resultado2 = !c;
        System.out.println("negacion !c = " + resultado2);












    }
}
