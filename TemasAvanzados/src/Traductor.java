public interface Traductor {
    //public y abstractos
    void traducir();

    //metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor....");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println(" tradusco a frances: Bonjour");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor frances....");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println(" tradusco a ingles: Hello");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        //traductor en frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}