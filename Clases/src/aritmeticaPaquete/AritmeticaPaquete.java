package aritmeticaPaquete;

public class AritmeticaPaquete {
    private int operando1;
    private int operando2;

    // constructores

    public AritmeticaPaquete(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Restulado suma = " + resultado);
    }

    public void restar(){
        int resultado = operando1 - operando2;
        System.out.println("resultado Resta = " + resultado);
    }

    public int getOperando1(){
        return this.operando1;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2 ;
    }

}
 //descripcion de set y get en java
// 1. set: establece un valor a un atributo de la clase
// 2. get: obtiene el valor de un atributo de la clase
// 3. se utilizan para proteger los atributos de la clase
// 4. se utilizan para acceder a los atributos de la clase
// 5. se utilizan para restringir el acceso a los atributos de la clase
// 6. se utilizan para restringir la modificacion de los atributos de la clase
// 7. se utilizan para restringir la obtencion de los atributos de la clase
// 8. se utilizan para restringir la modificacion de los atributos de la clase
// 9. se utilizan para restringir la obtencion de los atributos de la clase
// 10. se utilizan para restringir la modificacion de los atributos de la clase
// 11. se utilizan para restringir la obtencion de los atributos de la clase