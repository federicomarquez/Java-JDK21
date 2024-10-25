public class DecisionOperadorNot {
    public static void main(String[] args) {
        //sentecia de dicision y operador !
        System.out.println("***bienvenido alsisitema*** ");
        var salirSistema = false;
        if(!salirSistema) {
            System.out.println("continua en el sistema");
        } else {
            System.out.println("Saliendo del sistema");
        }
        //
        if(salirSistema){
            System.out.println("Saliendo del sistema");
        } else {
            System.out.println("continua en el sistema");
        }
    }
}
