public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("creacion de objetos de la clase persona");
        var objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Acosta";
        System.out.println();
        objeto2.mostrarPersona();
    }
}
