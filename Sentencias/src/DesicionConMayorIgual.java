import java.util.Scanner;

public class DesicionConMayorIgual {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("ingrese otro numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        if(numero1 >= numero2){
            System.out.println("el numero uno es mayor " + numero1);
        }else {
            System.out.println(" el numero dos es mayor " + numero2);
        }

    }
}
