package semana2.hilos;

public class HilosT extends Thread {

    @Override // Runnable
    public void run() { //Es importante redefinirlo para establecer "qué quieres que haga?"
        System.out.println("El hilo se está ejecutando");
    }

    /*
    public void start(){
        // inicia la ejecución de un hilo
        //la JVM llama al metodo run() del hilo
    }

    sleep -> detiene de manera temporal el numero esperado
    join () -> Espere a que el hilo se muera
    getPriority -> regresa la prioridad del hilo
    setPriority -> Establecec la prioridad del hilo
    getName -> nombre del hilo
    currentThread -> referencia al hilo que se esta ejecutando
    getId -> regresa el id del hilo
    Thread.State getState -> regresa el state del hilo
    isAlive -> verifica que si está vivo
    */

    public static void main(String[] args) {
        HilosT hilo = new HilosT(); //aquí inicia el proceso de hilo (state "new")
        hilo.start();
    }
}

class HilosR implements Runnable {
    @Override
    public void run() {
        System.out.println("El hilo de Runnable esta corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR(); //crea un hilo llamado "h"
        Thread t = new Thread(h); //se crea un nuevo hilo a partir del comportamiento que se defina
        t.start(); // inicia el nuevo hilo
    }
}
