package herencia.animal;

public class Animal {
    public void comer(){
        System.out.println("como muchas veces al dia");
    }
    public void dormir(){
        System.out.println("duermo muchas horas");
    }
}

//clase 2
class Perro extends Animal {
    public void hacerSonido(){
        System.out.println("puedo ladrar");
    }
    //@Override //buena practica para decir que estamos sobreescribiendo si no llamo al de la clase padre, esto es para sobreescribir el metodo desde la clase hija
    public void dormir(){
        System.out.println("Duermo 15 horas al dia");
        System.out.println("Metodo clase padre: " );
        super.dormir(); //con super llamo al metodo de la clase padre, no se puede agregar en el sout por que ya tiene un mensaje adentro el metodo
    }
}

//clase 3
class PRuebaAnimal{
    public static void main(String[] args) {
        System.out.println("***ejemplo herecia***");
        System.out.println("clase padre , soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido(); //este metodo no existe en la clase padre
        System.out.println("\nClase hija soy un perro");
        var perro1 = new Perro();
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();

    }
}
//solo una puede ser publica, solo una y podes contenes muchas clases