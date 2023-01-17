import javax.swing.*;

public class v1 {
    private JPanel panel;
    private JTextField ingreseSuNombreTextField;
    private JButton OKButton;

    public static void main(String[] args){
        JFrame frame = new JFrame("v1");
        frame.setContentPane(new v1().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
