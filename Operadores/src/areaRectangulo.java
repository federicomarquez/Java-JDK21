import java.util.Scanner;

public class areaRectangulo {
    public static void main(String[] args) {
        //area de rectangulo
        var area = 0;
        var base = 0;
        var altura = 0;
        var consola = new Scanner(System.in);
        System.out.println("Proporciona la base: ");
        base = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona la altura: ");
        altura = Integer.parseInt(consola.nextLine());
        area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
        //calculamos el perimetro
        var perimetro = 0;
        perimetro = (base + altura) * 2 ;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
