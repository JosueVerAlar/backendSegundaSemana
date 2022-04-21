package semana2.hilos;

public class TestJoin extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                 t2 = new TestJoin(),
                 t3 = new TestJoin();

        showDetails(t1, t2, t3);

        t1.start();

        try{
            t1.join(1500);
            t1.setName("LaunchX");
            t1.setPriority(MAX_PRIORITY);
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }

        t2.start();
        t3.start();
    }

    public static void showDetails (TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("Hilo 1: "+t1.getName()+
                           "\nid: "+t1.getId()+
                           "\nestado: "+t1.getState()+
                           "\nprioridad: "+t1.getPriority()+"\n\n");

        System.out.println("Hilo 1: "+t2.getName()+
                "\nid: "+t2.getId()+
                "\nestado: "+t2.getState()+
                "\nprioridad: "+t2.getPriority()+"\n\n");

        System.out.println("Hilo 1: "+t3.getName()+
                "\nid: "+t3.getId()+
                "\nestado: "+t3.getState()+
                "\nprioridad: "+t3.getPriority()+"\n\n");
    }
}