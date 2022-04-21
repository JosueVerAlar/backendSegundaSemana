public class HolaMundo {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Bienvenidos a la mision Backend Java\n", "Helvetica", 28, Colors.Desire);
        screen.setVisible(true);

        str = d.readString("¿Quieres aprender a hacer esto? s/n");
        if (str.charAt(0) == 'S' || str.charAt(0) == 's') {
            screen.showImage("C:\\Users\\Dell\\IdeaProjects\\DemosGUI\\src\\Ashe_0.jpg");
            screen.out("\nHola Explorers");
        } else
            screen.out("Tal vez en otro momento, Adios", "Century Schoolbook L", 28, Colors.BalticSea);
    }
}
