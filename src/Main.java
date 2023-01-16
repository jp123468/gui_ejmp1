import  javax.swing.JOptionPane;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        //Crea un panel que contiene un dibujo
    PanelDibujo panel = new PanelDibujo();
    //Crea un marco para el panel
    JFrame aplicacion = new JFrame();
    //Establece el marco
    aplicacion.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
    aplicacion.add(panel); //Añadimos un nuevo panel
        aplicacion.setSize(250,250);//
        aplicacion.setVisible(true);

    }
}
/*
        //JOptionPane.showMessageDialog(null, "Bienvenido\na\nJava")
*/
        /*
        //Pide al Usuario su nombre
        String nombre =
            JOptionPane.showInputDialog("Cual es tu nombre?");
        // Crea el mensaje
        String mensaje=
                String.format("Bienvenido, %s, a la programacion en Java!" , nombre);
        //MUestra el mensaje para dar la bienvenida al Usuario por su nombre
        JOptionPane.showMessageDialog(null,mensaje);
        */
/*
        // Pedimos la altura de la persona
        double altura =
                Double.parseDouble(JOptionPane.showInputDialog("¿Cual es tu Altura en metros?"));
        double  peso =
                Double.parseDouble(JOptionPane.showInputDialog("¿Cual es tu Peso en Kg?"));
        try {
            double IMC = peso/(altura*altura);
            String mensaje=
                    String.format("El calculo de tu IMC es: , %s, !" , IMC);
            catch(err){
                String mensaje1=
                    String.format("Bienvenido, %s, a la programacion en Java!" , mesaje1);
            //MUestra el mensaje para dar la bienvenida al Usuario por su nombre
            JOptionPane.showMessageDialog(null,mensaje1);
            }
        }
        JOptionPane.showMessageDialog(null,mensaje);*/



