package Excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 0);
            System.out.println("resultado = " + resultado);
        }catch(Exception e) {
            System.out.println("Ocurruo un error " + e);
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
    }
}
