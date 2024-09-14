package Persona;

public class ejPersona {
    private static int contadorPersona = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public ejPersona(String nombre , String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++ejPersona.contadorPersona;
    }

    @Override
    public String toString(){
        return "id persona: " + this.idPersona
                +    ",nombre: " + this.nombre
                + ", apellido: " + this.apellido;
    }

    public void mostrarPersona(){

        System.out.println("nombre = " + this.nombre);
        System.out.println("apellido = " + this.apellido);
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return ejPersona.contadorPersona;
    }

}
