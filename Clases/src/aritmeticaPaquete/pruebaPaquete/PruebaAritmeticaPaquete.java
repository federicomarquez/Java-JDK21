package aritmeticaPaquete.pruebaPaquete;

import aritmeticaPaquete.AritmeticaPaquete;

public class PruebaAritmeticaPaquete {
    public static void main(String[] args) {
        System.out.println("ejemplo aritmetica");
        var aritmetica1 = new AritmeticaPaquete(5,7);
//        aritmetica1.sumar();
//        aritmetica1.restar();
//        var aritmetica2 = new AritmeticaPaquete(12, 16);
//        System.out.println();
//        aritmetica2.sumar();
//        aritmetica2.restar();
          aritmetica1.setOperando1(9);
          System.out.println("aritmetica1.operando1 = " + aritmetica1.getOperando1());
          aritmetica1.sumar();
        System.out.println("valor del operando2 = " + aritmetica1.getOperando2());

    }
}
