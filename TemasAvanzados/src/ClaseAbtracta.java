public class ClaseAbtracta {

    public static void main(String[] args) {
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica() //error no se puede instanciar
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Triangulo();
        figuraGeometrica.dibujar();

        }
    }

//clase abstracta
abstract class FiguraGeometrica{ //no se puede instanciar
    public abstract void dibujar();

}

class Rectangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println(" se dibuja un Rectangulo");
    }
}

class Triangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println(" se dibuja un Triangulo");
    }
}