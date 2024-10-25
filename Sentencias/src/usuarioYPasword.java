public class usuarioYPasword {
    public static void main(String[] args) {
        //revisar si el usuario y pasword son correctos
        var consola = new java.util.Scanner(System.in);
        System.out.print("Proporciona el usuario: ");
        var usuario = consola.nextLine();
        System.out.print("Proporciona el pasword: ");
        var pasword = consola.nextLine();
        //revisar usuario = admin y pasword 123
        var usuarioCorrecto = "admin";
        var paswordCorrecto = "123";
        if (usuario.equals(usuarioCorrecto) && pasword.equals(paswordCorrecto)) {
            System.out.println("Bienvenido al sistema");
        }
        else if(usuarioCorrecto.equals(usuario) && !paswordCorrecto.equals(pasword)){
            System.out.println("Pasword incorrecto");
        }
        else if(!usuarioCorrecto.equals(usuario) && paswordCorrecto.equals(pasword)){
            System.out.println("Usuario incorrecto");
        }
        else {
            System.out.println("Usuario o pasword incorrectos");
        }
    }
}
