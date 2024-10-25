import java.util.Scanner;

public class ejercicioBiblioteca { //psvm
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Escribe el titulo del libro: ");
        var titulo = consola.nextLine();
        System.out.print("Escribe el autor del libro: ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
