package semana2;

abstract class Hola {
    void saludar(){
        //como lo hace
        System.out.println("¿Como estas?, te ves bien eh");
    }
    abstract void saludo();
}

interface Mostrar {
    //Que hace
    void show();
    abstract void despide();
}

public class SaludosCordiales implements Mostrar {
    public void show(){
        System.out.println("Hola, ¿cómo estas?, espero no del todo mal...");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }

    public void despide() {
    }
}
