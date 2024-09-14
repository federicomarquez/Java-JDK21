package Persona;

public class pruePersona {

    public static void main(String[] args) {
        System.out.println("creacion de objetos de la clase persona");
        var objeto1 = new ejPersona("layla", "acosta");
        //System.out.println(objeto1.toString()); //direccion de memoria
        System.out.println(objeto1); //como sobre escribimos el metodo toString, nos muestra los valores de los atributos
        var objeto2 = new ejPersona("luis", "acosta");
        System.out.println(objeto2);
        System.out.println("contadorPersona = "
                    + ejPersona.getContadorPersonas());}
}