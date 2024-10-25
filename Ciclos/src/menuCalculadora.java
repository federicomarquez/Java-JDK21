import java.util.Scanner;

public class menuCalculadora {
    public static void main(String[] args) {
        System.out.println("calculadora:");
        var salir = false;
        var num1 = 0.0;
        var num2 = 0.0;
        var console = new Scanner(System.in);
        while(!salir){
            System.out.print("""
                    menu:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    """);
            System.out.print("ingrese la opcion que desea realizar: ");
            var opcion = Integer.parseInt(console.nextLine());
            if(opcion >= 1 && opcion <= 5) {
                System.out.print("ingrese numero 1: ");
                var operador1 = Double.parseDouble(console.nextLine());
                System.out.print("ingrese numero 2: ");
                var operador2 = Double.parseDouble(console.nextLine());
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Suma: ");
                        var suma = operador1 + operador2;
                        System.out.println("La suma de ambos numeros es = " + suma);
                    }
                    case 2 -> {
                        System.out.println("Resta: ");
                        var resta = operador1 - operador2;
                        System.out.println("La resta de ambos numeros es = " + resta);
                    }
                    case 3 -> {
                        System.out.println("Multiplicacion: ");
                        var multi = operador1 * operador2;
                        System.out.println("La multiplicacion de ambos numeros es = " + multi);
                    }
                    case 4 -> {
                        System.out.println("Division: ");
                        if (operador2 > 0) {
                            var Divi = operador1 / operador2;
                            System.out.println("La division de ambos numeros es = " + Divi);
                        } else {
                            System.out.println("el numero ingresado es Incorrecto");
                        }
                    }
                    case 5 -> {
                        System.out.println("saliendo del sistema... Hasta luego");
                        salir = true;
                    }

                }
                }else{
                System.out.println("el numero ingresado no es correcto.");
            }
            }

        }
    }


