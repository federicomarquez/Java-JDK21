public class funcionSubCadena {
    public static void main(String[] args) {
        //obtener una subcadena
        var cadena = "Hola Mundo";
        //subcadena de hola y mundo
        //substring(indice_inicio, indice_final + 1)
        var subcadena = cadena.substring(0, 4);
        System.out.println("subcadena Hola = " + subcadena);
        var dubcadena2 = cadena.substring(5, 10);
        System.out.println("dubcadena2 Mundo = " + dubcadena2);
    }
}
