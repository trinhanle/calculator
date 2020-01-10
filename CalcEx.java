import javax.swing.*;


public class CalcEx {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JLabel display = new JLabel();
        display.setBounds(50,50,150,50);
        JButton eqButton = new JButton("=");
        eqButton.setBounds (350,450,40,40);
        f.add(eqButton);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
