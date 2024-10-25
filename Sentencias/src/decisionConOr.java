public class decisionConOr {
    public static void main(String[] args) {
        //sentencia if y operador logico or
        //sergio quiere asistir al juego de su hijo
        //pero solo puede asistir si tiene vacaciones o un dia de descanso
        var vacaciones = false;
        var diaDescanso = false;
        if (vacaciones || diaDescanso) {
            System.out.println("Sergio puede asistir al juego de su hijo");
        } else {
            System.out.println("Sergio no puede asistir al juego de su hijo");
        }
    }
}
