import  javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;

public class PanelDibujo extends JPanel {
        //dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g){
        //Con painCOmponent asegura que el panel se muestre correcto
        super.paintComponents(g);

        int anchura = getWidth();//anchura total
        int altura = getHeight();//altura total

        //Dibuja una linea de la esquina superior izquierda a la esquina inferior der
       // g.drawLine(1000,anchura,altura,100);
        g.drawLine(600,0,00,0);
        g.drawLine(300,0,300,400);
        g.drawLine(150,400,300,400);
        g.drawLine(150,400,150,300);
        //Dibuja una linea de la esquina inferior izquierda a la esquina superior der
      //  g.drawLine(0,altura,anchura,0);

    }
}
