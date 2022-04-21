package semana2;

abstract  class Mountain {
    Mountain(){
        System.out.println("Se ha creado una bicicleta de montana");
    }
    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a rojo");
    }
}

class Trek extends Mountain {
    void cambiarVelocidad(){
        System.out.println("Se deben desbloquear las perillas del manubrio primero");
    }
}

public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Trek();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
