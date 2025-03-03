import java.util.ArrayList;
import java.util.List;

public class ListasGenerics {
    public static void main(String[] args) {
        //con generics podemos especificar el tipo de dato que podemos guardar con "<tipo de Dato>"
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //miLista.add("Domingo");  permite duplicados

        for(String elemento: miLista){
            System.out.println("Dia de la semana = " + elemento);
        }


    }
}
