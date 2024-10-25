public class funcionesPreDefinidas {
    public static void main(String[] args) {
        //obtener el largo de una cadena
        var cadena = "Hola Mundo";
        System.out.println("Largo cadena: " + cadena.length());

        //recorremos la cadena
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(i + ": " + cadena.charAt(i));
        }
    }
}
