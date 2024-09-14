package herencia.animal;

public class AnimalPolimorfismo {
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

//clase 2
class Perro2 extends AnimalPolimorfismo {
    @Override
    public void hacerSonido(){
        System.out.println("el perro puede ladrar");
    }
}

class gato extends AnimalPolimorfismo{
    @Override
    public void hacerSonido(){
        System.out.println("el gato hace miau");
    }
}


//clase 3
class PruebaAnimal2{
    public static void main(String[] args) {
        System.out.println("creacion de objetos de la clase animal");
        //var animal = new AnimalPolimorfismo();
        var animal = new gato();
        animal.hacerSonido();

    }
}
//solo una puede ser publica, solo una y podes contenes muchas clases