public class comparacionCadena {
    public static void main(String[] args) {
        //comparacion de cadenas en java
        var cadena1 = "juan";
        var cadena2 = "juan";
        var consola = new java.util.Scanner(System.in);
        System.out.println("Proporciona una cadena: ");
        var cadena3 = consola.nextLine();
        if(cadena1 == cadena3){
            System.out.println("Las cadenas son iguales(en memoria)");
        }
        else {
            System.out.println("Las cadenas son diferentes(en memoria)");
        }
        //comparacion usando el metodo equals
        if(cadena1.equals(cadena3)){
            System.out.println("Las cadenas son iguales(en contenido)");
        }
        else {
            System.out.println("Las cadenas son diferentes(en contenido)");
        }
        //comparacion de cadenas con equalsIgnoreCase
        if(cadena1.equalsIgnoreCase(cadena3)){
            System.out.println("Las cadenas son iguales(sin importar mayusculas o minusculas)");
        }
        else {
            System.out.println("Las cadenas son diferentes(sin importar mayusculas o minusculas)");
        }

    }
}
