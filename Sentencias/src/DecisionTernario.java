import java.util.Scanner;

public class DecisionTernario {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("ingrese otro numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        System.out.println(numero1 > numero2?  numero1 : numero2);
    }
}
