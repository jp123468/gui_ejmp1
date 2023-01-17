import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class v1 {
    private JPanel panel1;
    private JButton IMCButton;
    private JTextField txtFieldAltura;
    private JTextField textFieldPeso;
    private JLabel LabelPeso;
    private JLabel LabelAltura;
    private JLabel LabelREspuesta;


    public v1() {
        IMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //LabelREspuesta.getText()
                LabelREspuesta.setText("HOLA");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("v1");
        frame.setContentPane((new v1()).panel1);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);


    }

}
