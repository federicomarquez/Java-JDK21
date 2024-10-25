import java.text.DecimalFormat;

public class funcionRedondeo {
    public static void main(String[] args) {
        //redondeo
        //mayor a .5 redondea hacia arriba
        var numero = 8.4;
        var redondeo = Math.round(numero);
        System.out.println("valor = " + numero + " redondeado = " + redondeo);
        //formato
        var patron = "#.#";
        //var patron = "#";
        var decimalFormat = new DecimalFormat(patron);
        var numeroFormato = decimalFormat.format(numero);
        System.out.println("valor = " + numero + " numeroFormato = " + numeroFormato);
    }
}
